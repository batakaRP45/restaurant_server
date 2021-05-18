package com.restaurant.manager.restaurant.repository;

import java.util.List;

import com.restaurant.manager.restaurant.domain.Customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Page<Customer> findByNameContaining(Pageable pageable, String search);

    List<Customer> findByNameContaining(String search);
}
