package com.exercise.crud.service;

import com.exercise.crud.entity.UserAddress;
import com.exercise.crud.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AddressService {
    @Autowired
    private AddressRepository repo;

    public UserAddress getUserAddressById(int id){
        return repo.findById(id);
    }
    public UserAddress saveUserAddress(UserAddress address){
        return repo.save(address);
    }
}
