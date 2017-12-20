package edu.csula.aquila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.csula.aquila.daos.UserDao;
import edu.csula.aquila.model.User;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public List<User> getUsers()
    {
        return userDao.getUsers();
    }
    
    @RequestMapping(value ="/api/user1", method = RequestMethod.GET)
    public User getUser(@RequestParam("id") Long id)
    {
    	return userDao.getUser(id); 
    }
    
    @RequestMapping(value = "/saveuser", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) 
    {
    	return userDao.saveUser(user);
    }
    
}