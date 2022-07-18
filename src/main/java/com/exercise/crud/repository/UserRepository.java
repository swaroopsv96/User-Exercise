package com.exercise.crud.repository;
import com.exercise.crud.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findById(int id);
//    User findByName(String name);
}