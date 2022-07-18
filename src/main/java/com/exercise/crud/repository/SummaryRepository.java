package com.exercise.crud.repository;
import com.exercise.crud.entity.UserSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SummaryRepository extends JpaRepository<UserSummary,Integer>{
    List<UserSummary> findAll();
}