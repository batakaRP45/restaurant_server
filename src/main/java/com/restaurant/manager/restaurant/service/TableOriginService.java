package com.restaurant.manager.restaurant.service;

import java.util.List;

import com.restaurant.manager.restaurant.domain.TableOrigin;
import com.restaurant.manager.restaurant.repository.TableOriginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableOriginService {
    @Autowired
    private TableOriginRepository tableOriginRepository;
    @Autowired
    private TableService tableService;
    public List<TableOrigin> getAll(){
        return tableOriginRepository.findAll();
    }

    public List<TableOrigin> getTableDisplay(Boolean status, String date){
        return tableOriginRepository.findByIdNotIn(tableService.getAllStatus(status, date));
    }
}
