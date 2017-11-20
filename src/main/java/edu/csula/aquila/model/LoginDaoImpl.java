package edu.csula.aquila.model;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.hibernate.*;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	  @Override
	    public Boolean verifyLogin( String username, String password ) 
	    {
		  boolean userVerified = false;
		  Session thisSession = sessionFactory.openSession();
		  
		  String query = "from User u where u.username = :username and u.password = :password";
		  thisSession.createQuery(query, User.class).setParameter( "username", username.toLowerCase() ); 
		  thisSession.createQuery(query, User.class).setParameter( "password", password);
		 
		  List results = thisSession.createQuery(query).list();
	    	   	
	    	if(results.size()>0 && results != null) {
	    		userVerified = true;
	    	}
	    	
	    	thisSession.close();
	    	return userVerified;
	    }

}
