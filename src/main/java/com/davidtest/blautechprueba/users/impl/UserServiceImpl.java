package com.davidtest.blautechprueba.users.impl;

import com.davidtest.blautechprueba.users.User;
import com.davidtest.blautechprueba.users.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    private List<User> users = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void createUser(User user) {
        // set +1 to the user id 
        user.setId( nextId++ );
        users.add(user);
    }

    @Override
    public User getUserById(Long id) {
        //take a look ever id and return the data found
        for( User user: users){
            if(user.getId().equals(id)){
                return user;
            }
        }
      return null;
    }

    @Override
    public boolean deleteUserById(Long id) {
        // search for the user with that id 
        // we iterate into the users object
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if( user.getId().equals(id)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateUser(Long id, User updateUser) {
        for(User user: users){
            if( user.getId().equals(id)){
                user.setName(updateUser.getName());
                user.setLastName(updateUser.getLastName());
                user.setMailingAddress(updateUser.getMailingAddress());
                user.setEmail(updateUser.getEmail());
                user.setDob(updateUser.getDob());
                user.setPassword(updateUser.getPassword());
                return true;
            }
        }
        return false;
    }

}
