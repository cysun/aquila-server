package edu.csula.aquila.daos;

import edu.csula.aquila.model.User;

public interface LoginDao {

	public User returnUser( String username );
	
	public Boolean verifyLogin(String username, String password);
	
	public User loginTrue( String username, String password);
	
}
