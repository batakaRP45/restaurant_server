package com.restaurant.manager.restaurant.service;

import com.restaurant.manager.restaurant.domain.Customer;
import com.restaurant.manager.restaurant.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Page<Customer> getCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public int countAllCustomer(){
        return customerRepository.findAll().size();
    }

    public int countSearchCustomer(String search) {
        return customerRepository.findByNameContaining(search).size();
    }
}
