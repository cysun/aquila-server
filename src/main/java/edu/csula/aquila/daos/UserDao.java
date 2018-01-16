
package edu.csula.aquila.daos;

import java.util.List;

import edu.csula.aquila.model.User;

public interface UserDao {

    User getUser( Long id );

    User getUserByUsername( String username );

    User getUserByEmail( String email );

    List<User> getUsers();

    User saveUser( User user );
    
    User editUser( User user );
    
    
}
