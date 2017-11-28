package edu.csula.aquila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.csula.aquila.model.User;
import edu.csula.aquila.model.LoginDao;

@RestController
public class LoginController {
	
	@Autowired
	private LoginDao loginDao;

	
	@RequestMapping(value ="/login", method = RequestMethod.GET)
	public User loginTrue(@RequestParam("username") String username, @RequestParam("password") String password)
    {
		return loginDao.loginTrue(username, password);
    }
}
