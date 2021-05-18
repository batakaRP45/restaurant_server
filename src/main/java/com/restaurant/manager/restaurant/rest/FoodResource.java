package com.restaurant.manager.restaurant.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.github.jhipster.web.util.PaginationUtil;

import java.util.List;

import com.restaurant.manager.restaurant.domain.Food;
import com.restaurant.manager.restaurant.repository.FoodRepository;
import com.restaurant.manager.restaurant.service.FoodService;
import com.restaurant.manager.restaurant.shared.Constants;
import com.restaurant.manager.restaurant.shared.Sorts;

@RestController
@RequestMapping("/api")
public class FoodResource {
    @Autowired
    private FoodService foodService;
    @Autowired
    private FoodRepository foodRepository;
    // @Autowired
    // private FoodSearchRepository foodSearchRepository;

    @GetMapping("/get-food")
    @CrossOrigin(Constants.CLI_URL)
    public ResponseEntity<List<Food>> getAllFoods(
            @RequestParam(name = "page", required = false, defaultValue = Constants.PAGE) Integer page,
            @RequestParam(name = "size", required = false, defaultValue = Constants.SIZE) Integer size,
            @RequestParam(name = "sort", required = false, defaultValue = Constants.SORT) String sort,
            @RequestParam(name = "feild", required = false, defaultValue = Constants.FEILD) String feild) {

        Pageable pageable = PageRequest.of(page, size, Sorts.sort(sort, feild));
        Page<Food> pageContent = foodRepository.findAllWithEagerRelationships(pageable);
        HttpHeaders headers = PaginationUtil
                .generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), pageContent);
        return ResponseEntity.ok().headers(headers).body(pageContent.getContent());
    }

    @GetMapping("/search-food")
    @CrossOrigin(Constants.CLI_URL)
    public ResponseEntity<List<Food>> searchFood(
            @RequestParam(name = "page", required = false, defaultValue = Constants.PAGE) Integer page,
            @RequestParam(name = "size", required = false, defaultValue = Constants.SIZE) Integer size,
            @RequestParam(name = "sort", required = false, defaultValue = Constants.SORT) String sort,
            @RequestParam(name = "feild", required = false, defaultValue = Constants.FEILD) String feild,
            @RequestParam(name = "search", required = false, defaultValue = Constants.SEARCH) String search) {
        Pageable pageable = PageRequest.of(page, size, Sorts.sort(sort, feild));
        Page<Food> pageContent = foodRepository.findByNameContaining(pageable, search);
        HttpHeaders headers = PaginationUtil
                .generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), pageContent);
        return ResponseEntity.ok().headers(headers).body(pageContent.getContent());
    }

    @GetMapping("/count-all")
    @CrossOrigin(Constants.CLI_URL)
    public int countAllFood() {
        return foodService.countAllFood();
    }

    @GetMapping("/count-search/{search}")
    @CrossOrigin(Constants.CLI_URL)
    public int countSearchFood(@PathVariable("search") String search) {
        return foodService.countSearchFood(search);
    }

    @GetMapping("/count-food-category/{id}")
    @CrossOrigin(Constants.CLI_URL)
    public int countFoodCategory(@PathVariable("id") Long id) {
        return foodService.countFoodCategory(id);
    }

    @GetMapping("/find-food-by-category")
    @CrossOrigin(Constants.CLI_URL)
    public ResponseEntity<List<Food>> findFoodByCategory(
            @RequestParam(name = "page", required = false, defaultValue = Constants.PAGE) Integer page,
            @RequestParam(name = "size", required = false, defaultValue = Constants.SIZE) Integer size,
            @RequestParam(name = "sort", required = false, defaultValue = Constants.SORT) String sort,
            @RequestParam(name = "feild", required = false, defaultValue = Constants.FEILD) String feild,
            @RequestParam(name = "category_id", required = false, defaultValue = "1") Long category_id) {
        Pageable pageable = PageRequest.of(page, size, Sorts.sort(sort, feild));
        Page<Food> pageContent = foodRepository.findByFoodCategoryId(pageable, category_id);
        HttpHeaders headers = PaginationUtil
                .generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), pageContent);
        return ResponseEntity.ok().headers(headers).body(pageContent.getContent());
    }
    // @GetMapping(value = "/get-food-elasticsearch", produces =
    // MediaType.APPLICATION_JSON_VALUE)
    // public List<Food> getFood() {
    // return foodService.getFoodElasticSearch();
    // }

    // @GetMapping("/search-food")
    // public ResponseEntity<List<Food>> searchFoods(@RequestParam(name = "search")
    // String search,
    // @RequestParam(name = "page", required = false, defaultValue = Constants.PAGE)
    // Integer page,
    // @RequestParam(name = "size", required = false, defaultValue = Constants.SIZE)
    // Integer size,
    // @RequestParam(name = "sort", required = false, defaultValue = Constants.SORT)
    // String sort,
    // @RequestParam(name = "feild", required = false, defaultValue =
    // Constants.FEILD) String feild) {

    // Pageable pageable = PageRequest.of(page, size, Sorts.sort(sort, feild));
    // Page<Food> pageContent =
    // foodSearchRepository.findByNameLike(QueryBuilders.queryStringQuery(search),
    // pageable);
    // HttpHeaders headers = PaginationUtil
    // .generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(),
    // pageContent);
    // return ResponseEntity.ok().headers(headers).body(pageContent.getContent());
    // }
}