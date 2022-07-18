package com.exercise.crud.service;

import com.exercise.crud.entity.UserSummary;
import com.exercise.crud.repository.SummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummaryService {
    @Autowired
    private SummaryRepository repo;

    public List<UserSummary> getUserSummary(){
        return repo.findAll();
    }
}
