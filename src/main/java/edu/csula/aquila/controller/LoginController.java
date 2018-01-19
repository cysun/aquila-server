package edu.csula.aquila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.csula.aquila.daos.LoginDao;
import edu.csula.aquila.model.User;

@RestController
public class LoginController {
	
	@Autowired
	private LoginDao loginDao;

	
	@RequestMapping(value ="/login", method = RequestMethod.POST)
	public User loginTrue(@RequestBody User user)
    {
		String username = user.getUsername();
		String password = user.getPassword();
		return loginDao.loginTrue(username, password);
    }


}

