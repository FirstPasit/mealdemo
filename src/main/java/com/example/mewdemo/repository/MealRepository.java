package com.example.mewdemo.repository;

import com.example.mewdemo.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealRepository  extends JpaRepository<Meal, Integer> {
    List<Meal> findByName(String name);
    List<Meal> findByNameContaining(String name);
    List<Meal> findByPriceBetween(int lb, int ub);

}
