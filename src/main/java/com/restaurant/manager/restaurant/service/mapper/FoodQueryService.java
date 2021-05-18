package com.restaurant.manager.restaurant.service.mapper;

import java.util.List;

import com.restaurant.manager.restaurant.domain.Food;
import com.restaurant.manager.restaurant.domain.Food_;
import com.restaurant.manager.restaurant.repository.FoodRepository;
import com.restaurant.manager.restaurant.service.dto.FoodCriteria;
import com.restaurant.manager.restaurant.service.dto.FoodDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;

import io.github.jhipster.service.QueryService;

public class FoodQueryService extends QueryService<Food> {
    private final Logger log = LoggerFactory.getLogger(FoodQueryService.class);

    private final FoodRepository foodRepository;

    private final FoodMapper foodMapper;


    public FoodQueryService(FoodRepository foodRepository, FoodMapper foodMapper) {
        this.foodRepository = foodRepository;
        this.foodMapper = foodMapper;
    }

//     @Transactional(readOnly = true)
//     public List<FoodDTO> findByCriteria(FoodCriteria criteria){
//         log.debug("find by criteria : {}", criteria);
//         final Specification<Food> specification = createSpecification(criteria);
//         return (List<FoodDTO>) foodMapper.foodtoFoodDTO((Food) foodRepository.findAll((Sort) specification));
//     }
    
//     protected Specification<Food> createSpecification(FoodCriteria criteria) {
//         Specification<Food> specification = Specification.where(null);
//         if (criteria != null) {
//             if (criteria.getId() != null) {
//                 specification = specification.and(buildRangeSpecification(criteria.getId(), Food_.id));
//             }
//             if (criteria.getName() != null) {
//                 specification = specification.and(buildStringSpecification(criteria.getName(), Food_.name));
//             }
//             if (criteria.getDescription() != null) {
//                 specification = specification.and(buildStringSpecification(criteria.getDescription(), Food_.description));
//             }
//             if (criteria.getPrice() != null) {
//                 specification = specification.and(buildRangeSpecification(criteria.getPrice(), Food_.price));
//             }
//             if (criteria.getRate() != null) {
//                 specification = specification.and(buildRangeSpecification(criteria.getRate(), Food_.rate));
//             }
//             if (criteria.getFood_img() != null) {
//                 specification = specification.and(buildStringSpecification(criteria.getFood_img(), Food_.food_img));
//             }
//             if (criteria.getFood_vote_quantity() != null) {
//                 specification = specification.and(buildRangeSpecification(criteria.getFood_vote_quantity(), Food_.food_vote_quantity));
//             }
//             if (criteria.getFood_last_vote() != null) {
//                 specification = specification.and(buildRangeSpecification(criteria.getFood_last_vote(), Food_.food_last_vote));
//             }
//             if (criteria.getCreated_by() != null) {
//                 specification = specification.and(buildStringSpecification(criteria.getCreated_by(), Food_.created_by));
//             }
//             if (criteria.getFood_category_id() != null) {
//                 specification = specification.and(buildRangeSpecification(criteria.getFood_category_id(), Food_.food_category_id));
//             }
            
//         }
//         return specification;
//     }
 }
