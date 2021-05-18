package com.restaurant.manager.restaurant.rest;

import java.util.List;

import com.restaurant.manager.restaurant.domain.TableOrigin;
import com.restaurant.manager.restaurant.service.TableOriginService;
import com.restaurant.manager.restaurant.shared.Constants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TableOriginResource {
    @Autowired
    private TableOriginService tableOriginService;

    @GetMapping("/get-table-origin")
    @CrossOrigin(Constants.CLI_URL)
    public List<TableOrigin> getAllTableOrigin() {
        return tableOriginService.getAll();
    }

    @GetMapping("/get-table-display")
    @CrossOrigin(Constants.CLI_URL)
    public List<TableOrigin> getTableDisplay(Boolean status, String date) {
        return tableOriginService.getTableDisplay(status, date);
    }
}
