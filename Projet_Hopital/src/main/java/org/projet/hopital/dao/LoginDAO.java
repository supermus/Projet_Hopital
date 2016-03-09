package org.projet.hopital.dao;
import org.projet.hopital.model.*;

public interface LoginDAO {
	public boolean checkLogin(String login, String mdp);
	
}
