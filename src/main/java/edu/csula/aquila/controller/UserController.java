package edu.csula.aquila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.csula.aquila.daos.UserDao;
import edu.csula.aquila.model.User;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers()
    {
        return userDao.getUsers();
    }
    
    @RequestMapping(value ="/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id)
    {
    	return userDao.getUser(id); 
    }
    
    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) 
    {
    	return userDao.saveUser(user);
    }
    
    @RequestMapping(value ="/user/{id}", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user, @PathVariable Long id)
    {
    	return userDao.saveUser(user); 
    }
    
}