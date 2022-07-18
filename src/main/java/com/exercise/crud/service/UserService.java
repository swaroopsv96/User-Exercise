package com.exercise.crud.service;

import com.exercise.crud.entity.User;
import com.exercise.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // Add new user
    public User saveUser(User user){
        return repo.save(user);
    }
    // Get user by ID
    public User getUserById(int id) {
        return repo.findById(id).orElse(null);
    }
    // Delete user by id
    public String deleteUserById(int id){
        repo.deleteById(id);
        return "Deleted user" + id;
    }

//    public User getUserByName(String name){return repo.findByName(name);}

    // Update user details
    public User updateUser(User user){
        User existingUser = repo.findById((user.getId()));
        existingUser.setAnnualSalary(user.getAnnualSalary());
        existingUser.setDateOfBirth(user.getDateOfBirth());
        existingUser.setEmail(user.getEmail());
        existingUser.setFirstName(user.getFirstName());
        existingUser.setFullName(user.getFullName());
        existingUser.setGender(user.getGender());
        existingUser.setId(user.getId());
        existingUser.setMobilePhone(user.getMobilePhone());
        existingUser.setUserType(user.getUserType());
        return repo.save(existingUser);
    }
}
