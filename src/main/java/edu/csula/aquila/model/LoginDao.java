package edu.csula.aquila.model;

public interface LoginDao {

	Boolean verifyLogin(String username, String password);
}
