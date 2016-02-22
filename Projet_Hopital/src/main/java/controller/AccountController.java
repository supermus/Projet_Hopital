package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import entities.*;

@Controller
@RequestMapping(value="account")
public class AccountController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String login(ModelMap modelMap){
		modelMap.put("acc", new Compte());
		
		return "login";
		
	}
	
}
