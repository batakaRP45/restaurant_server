package com.restaurant.manager.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.restaurant.manager.restaurant.domain.Food;
import com.restaurant.manager.restaurant.repository.FoodRepository;
//import com.restaurant.manager.restaurant.repository.search.FoodRepo;
import com.restaurant.manager.restaurant.service.dto.FoodDTO;
import com.restaurant.manager.restaurant.service.mapper.FoodMapper;

@Service
@Transactional
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private FoodMapper foodMapper;

    @Transactional(readOnly = true)
    public Page<Food> getAllFood(Pageable pageable) {
        return foodRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public int countAllFood() {
        int count = foodRepository.findAll().size();
        return count;
    }

    @Transactional(readOnly = true)
    public int countSearchFood(String search) {
        int count = foodRepository.findByNameContaining(search).size();
        return count;
    }

    @Transactional(readOnly = true)
    public int countFoodCategory(Long id) {
        int count = foodRepository.findByFoodCategoryId(id).size();
        return count;
    }
}