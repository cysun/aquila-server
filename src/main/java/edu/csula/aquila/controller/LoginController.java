package edu.csula.aquila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.csula.aquila.model.LoginDao;
import edu.csula.aquila.model.User;

@RestController
public class LoginController {
	
	@Autowired
	private LoginDao loginDao;
	
	/*@RequestMapping(value="/login", method = RequestMethod.GET)
	public boolean verifyLogin( String username, String password) 
	{
		return loginDao.verifyLogin(username, password);
	}
	*/
	@RequestMapping(value ="/login", method = RequestMethod.GET)
	public boolean verifyLogin(@RequestParam("username") String username, @RequestParam("password") String password)
    {
		return loginDao.verifyLogin(username, password);
    }
}
