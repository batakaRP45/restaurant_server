package com.restaurant.manager.restaurant.rest;

import java.util.List;

import com.restaurant.manager.restaurant.domain.FoodCategory;
import com.restaurant.manager.restaurant.service.FoodCategoryService;
import com.restaurant.manager.restaurant.shared.Constants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FoodCategoryResource {
    @Autowired
    private FoodCategoryService foodCategoryService;

    @GetMapping("/get-category")
    @CrossOrigin(Constants.CLI_URL)
    public List<FoodCategory> getAllCategory() {
        return foodCategoryService.getAllCategory();
    }
}
