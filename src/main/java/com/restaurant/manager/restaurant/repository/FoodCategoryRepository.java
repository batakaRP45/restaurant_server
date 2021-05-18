package com.restaurant.manager.restaurant.repository;

import java.util.List;

import com.restaurant.manager.restaurant.domain.FoodCategory;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {
    List<FoodCategory> findAll(Sort sort);
}
