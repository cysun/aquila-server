package edu.csula.aquila.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


@Repository
public class LoginDaoImpl implements LoginDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	
	
	@Override
	public User returnUser( String username )
    {
        String query = "from User where lower(username) = :username";

        List<User> users = entityManager.createQuery( query, User.class )
            .setParameter( "username", username.toLowerCase() )
            .getResultList();
        return users.size() == 0 ? null : users.get( 0 );
    }
	
	
	@Override
	public Boolean verifyLogin( String username, String password ) 
	{
		boolean userVerified = false;

		String query = "from User u where u.username = :username and u.password = :password";

		List<User> results = entityManager.createQuery(query, User.class).setParameter( "username", username.toLowerCase()).setParameter( "password", password ).getResultList();
		

		if(results.size()>0 && results != null) 
		{
			userVerified = true;
		}

		return userVerified;

	}

	  
	@Override
	public User loginTrue( String username, String password)
	{
		User user = null;
		if(verifyLogin(username, password) == true)
		{
			user = returnUser(username);
		}
		return user;
	}
	
}