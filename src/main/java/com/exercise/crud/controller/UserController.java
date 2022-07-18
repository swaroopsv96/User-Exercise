package com.exercise.crud.controller;

import com.exercise.crud.entity.User;
import com.exercise.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    // Save new user to database
    @PostMapping("/users")
    public User saveUser(@Valid @RequestBody User user){
        return service.saveUser(user);
    }

    //Getting user from mentioned id
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {return service.getUserById(id);
    }
//    @GetMapping("/users/{name}")
//    public User getUserByName(@PathVariable String name){return service.getUserByName(name);}

    //Updating user details by providing body with id
    @PutMapping("/users/{id}")
    public User updateUser(@RequestBody User user){return service.updateUser(user);}

    //Delete the mentioned user id
    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable int id){return service.deleteUserById(id);
    }
}
