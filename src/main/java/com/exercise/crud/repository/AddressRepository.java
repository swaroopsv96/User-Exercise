package com.exercise.crud.repository;
import com.exercise.crud.entity.UserAddress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<UserAddress,Integer>{
    UserAddress findById(int id);
}
