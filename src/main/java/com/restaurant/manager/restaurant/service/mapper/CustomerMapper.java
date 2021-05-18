package com.restaurant.manager.restaurant.service.mapper;

import com.restaurant.manager.restaurant.domain.Customer;
import com.restaurant.manager.restaurant.service.dto.CustomerDTO;

import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toEntity(CustomerDTO dto){
        if(dto == null){
            return null;
        }else{
            Customer entity = new Customer();
            entity.setId(dto.getId());
            entity.setName(dto.getName());
            entity.setPhone_number(dto.getPhone_number());
            entity.setEmail(dto.getEmail());
            entity.setTableId(dto.getTableId());
            entity.setAddress(dto.getAddress());
            return entity;
        }
    }

    public CustomerDTO toDTO(Customer entity){
        if(entity == null){
            return null;
        }else{
            CustomerDTO dto = new CustomerDTO();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setPhone_number(entity.getPhone_number());
            dto.setEmail(entity.getEmail());
            dto.setTableId(entity.getTableId());
            dto.setAddress(entity.getAddress());
            return dto;
        }
    }
}
