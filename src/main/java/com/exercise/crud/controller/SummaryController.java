package com.exercise.crud.controller;

import com.exercise.crud.entity.UserSummary;
import com.exercise.crud.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SummaryController {
    @Autowired
    private SummaryService service;
    //Getting user from mentioned id
    @GetMapping("/users/summary")
    public List<UserSummary> getUserSummary() {return service.getUserSummary();
    }
}
