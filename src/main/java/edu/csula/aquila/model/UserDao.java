package edu.csula.aquila.model;

import java.util.List;

public interface UserDao {

    User getUser( Long id );

    User getUserByUsername( String username );

    User getUserByEmail( String email );

    List<User> getUsers();

    User saveUser( User user );

}
