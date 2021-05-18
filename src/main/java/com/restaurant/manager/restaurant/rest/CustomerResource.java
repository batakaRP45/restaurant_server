package com.restaurant.manager.restaurant.rest;

import java.util.List;

import com.restaurant.manager.restaurant.domain.Customer;
import com.restaurant.manager.restaurant.repository.CustomerRepository;
import com.restaurant.manager.restaurant.service.CustomerService;
import com.restaurant.manager.restaurant.shared.Constants;
import com.restaurant.manager.restaurant.shared.Sorts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.github.jhipster.web.util.PaginationUtil;

@RestController
@RequestMapping("/api")
public class CustomerResource {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/get-customer")
    @CrossOrigin(Constants.CLI_URL)
    public ResponseEntity<List<Customer>> getAllCustomer(
            @RequestParam(name = "page", required = false, defaultValue = Constants.PAGE) Integer page,
            @RequestParam(name = "size", required = false, defaultValue = Constants.SIZE) Integer size,
            @RequestParam(name = "sort", required = false, defaultValue = Constants.SORT) String sort,
            @RequestParam(name = "feild", required = false, defaultValue = Constants.FEILD) String feild) {
        Pageable pageable = PageRequest.of(page, size, Sorts.sort(sort, feild));
        Page<Customer> pageContent = customerRepository.findAll(pageable);
        HttpHeaders headers = PaginationUtil
                .generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), pageContent);
        return ResponseEntity.ok().headers(headers).body(pageContent.getContent());
    }

    @GetMapping("/search-customer")
    @CrossOrigin(Constants.CLI_URL)
    public ResponseEntity<List<Customer>> searchCustomer(
            @RequestParam(name = "page", required = false, defaultValue = Constants.PAGE) Integer page,
            @RequestParam(name = "size", required = false, defaultValue = Constants.SIZE) Integer size,
            @RequestParam(name = "sort", required = false, defaultValue = Constants.SORT) String sort,
            @RequestParam(name = "feild", required = false, defaultValue = Constants.FEILD) String feild,
            @RequestParam(name = "search", required = false, defaultValue = Constants.SEARCH) String search) {
        Pageable pageable = PageRequest.of(page, size, Sorts.sort(sort, feild));
        Page<Customer> pageContent = customerRepository.findByNameContaining(pageable, search);
        HttpHeaders headers = PaginationUtil
                .generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), pageContent);
        return ResponseEntity.ok().headers(headers).body(pageContent.getContent());
    }

    @PostMapping("/save-customer")
    @CrossOrigin(Constants.CLI_URL)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping("/count-all-customer")
    @CrossOrigin(Constants.CLI_URL)
    public int countAllCustomer(){
        return customerService.countAllCustomer();
    }

    @GetMapping("/count-search-customer/{search}")
    @CrossOrigin(Constants.CLI_URL)
    public int countSearchCustomer(@PathVariable("search") String search){
        return customerService.countSearchCustomer(search);
    }
}
