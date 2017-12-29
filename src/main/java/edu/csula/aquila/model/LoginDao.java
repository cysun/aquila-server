package edu.csula.aquila.model;


public interface LoginDao {

	public User returnUser( String username );
	
	public Boolean verifyLogin(String username, String password);
	
	public User loginTrue( String username, String password);
	
	
}
