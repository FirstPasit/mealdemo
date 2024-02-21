package com.example.mewdemo.controller;

import com.example.mewdemo.model.Meal;
import com.example.mewdemo.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private MealRepository mealRepo;
    @GetMapping("/meal/{name}")
    List<Meal> getMealByName(@PathVariable(value="name") String name){
        return mealRepo.findByName(name);
    }
}
