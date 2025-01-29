package com.davidtest.blautechprueba.users;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// import java.util.ArrayList;
import java.util.List;


@RestController
public class userController {

    private UserService userService; //it self it is not inizalizate

    public userController( UserService userService){
        this.userService = userService;   
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> findAll(){
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<>("User added successfully", HttpStatus.OK);
    } 
    
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id ){
        
        User user = userService.getUserById(id);
        if(user != null) return new ResponseEntity<>(user, HttpStatus.OK);

        // return new User( 1L, "Hello", "There is no one here", "anywhere", "none@none.com", "01/01/9999", null);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id ){
        boolean deleted = userService.deleteUserById( id );
        if( deleted )
            return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<String> updateUser( @PathVariable Long id, @RequestBody User updateUser ){

        boolean updated = userService.updateUser( id, updateUser );
        if( updated )
            return new ResponseEntity<>("User updated successfully", HttpStatus.OK );
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

}

