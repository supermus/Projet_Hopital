package controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="account")
public class AccountController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String login(){
		return "login";
		
	}
	
}
