package org.projet.hopital.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.projet.hopital.dao.*;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	 private LoginDAO loginDAO;

	   public void setLoginDAO(LoginDAO loginDAO) {
             this.loginDAO = loginDAO;
      }
     
      public boolean checkLogin(String login, String mdp){
             System.out.println("In Service class...Check Login");
             return loginDAO.checkLogin(login, mdp);
      }

}
