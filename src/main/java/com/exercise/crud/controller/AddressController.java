package com.exercise.crud.controller;

import com.exercise.crud.entity.UserAddress;
import com.exercise.crud.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AddressController {
    @Autowired
    private AddressService service;

    //Getting address from mentioned id
    @GetMapping("/users/address/{id}")
    public UserAddress getUserAddressById(@PathVariable int id) {return service.getUserAddressById(id);
    }

    //Saving address to user id
    @PostMapping("/users/address")
    public UserAddress saveUserAddress(@RequestBody UserAddress address){
        return service.saveUserAddress(address);
    }
}
