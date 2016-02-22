package model;
import org.hibernate.Query;

import entities.Compte;

public class AccountModel extends AbstractModel{
	
	public AccountModel(){
		super(Compte.class);
		
	}

	public Compte login(String login, String mdp){
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();
			Query query = sessionFactory.getCurrentSession().createQuery("from compte where login=:login and mdp=:mdp");
			query.setString("login", login);
			query.setString("mdp", mdp);
			return (Compte) query.uniqueResult();
		} catch (Exception e) {
			return null;
		}
	}
}
