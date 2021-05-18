package com.restaurant.manager.restaurant.service;

import java.util.List;

import com.restaurant.manager.restaurant.domain.FoodCategory;
import com.restaurant.manager.restaurant.repository.FoodCategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class FoodCategoryService {
    @Autowired
    private FoodCategoryRepository foodCategoryRepository;

    public List<FoodCategory> getAllCategory() {
        return foodCategoryRepository.findAll(Sort.by("id").descending());
    }
}
