package com.davidtest.blautechprueba.users;

import java.util.List;

public interface UserService {

    List<User> findAll();
    void createUser( User user);
    User getUserById(Long id);
    boolean deleteUserById(Long id);
    boolean updateUser(Long id, User updateUser);
    
}
