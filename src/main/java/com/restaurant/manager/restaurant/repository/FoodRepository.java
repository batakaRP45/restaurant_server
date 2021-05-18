package com.restaurant.manager.restaurant.repository;

import java.util.List;

import com.restaurant.manager.restaurant.domain.Food;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    @Query(value = "select distinct f from Food f", countQuery = "select count(distinct f) from Food f")
    Page<Food> findAllWithEagerRelationships(Pageable pageable);

    Page<Food> findByNameContaining(Pageable pageable, String search);

    List<Food> findByNameContaining(String search);

    Page<Food> findByFoodCategoryId(Pageable pageable, Long id);

    List<Food> findByFoodCategoryId(Long id);
}