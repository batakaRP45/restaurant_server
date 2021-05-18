package com.restaurant.manager.restaurant.rest;

import java.sql.Date;
import java.util.List;

import com.restaurant.manager.restaurant.domain.TableE;
import com.restaurant.manager.restaurant.domain.TableEn;
import com.restaurant.manager.restaurant.repository.TableRepository;
import com.restaurant.manager.restaurant.repository.TableRepositoryIml;
import com.restaurant.manager.restaurant.service.TableService;
import com.restaurant.manager.restaurant.service.dto.TableDTO;
import com.restaurant.manager.restaurant.service.dto.TableEnDTO;
import com.restaurant.manager.restaurant.shared.Constants;
import com.restaurant.manager.restaurant.shared.Sorts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.github.jhipster.web.util.PaginationUtil;

@RestController
@RequestMapping("/api")
public class TableResource {
    @Autowired
    private TableService tableService;
    @Autowired
    private TableRepository tableRepository;
    @Autowired
    private TableRepositoryIml tableRepositoryIml;

    @GetMapping("/get-table")
    @CrossOrigin(Constants.CLI_URL)
    public List<TableE> listTable() {
        return tableService.listTable();
    }

    @PostMapping("/post-table")
    @CrossOrigin(Constants.CLI_URL)
    public TableEn postTable(@RequestBody TableEn tableEn) {
        return tableService.save(tableEn);
    }

    @PutMapping("/put-table")
    @CrossOrigin(Constants.CLI_URL)
    public TableDTO putTable(@RequestBody TableDTO dto) {
        return tableService.update(dto);
    }

    @DeleteMapping("/delete-table")
    @CrossOrigin(Constants.CLI_URL)
    public void deleteTable(@RequestBody TableDTO dto) {
        tableService.delete(dto);
    }

    @GetMapping("/get-use")
    @CrossOrigin(Constants.CLI_URL)
    public List<TableEnDTO> getUse(Date date) {
        return tableService.getUseTable(date);
    }

    @GetMapping("/get-table-status")
    @CrossOrigin(Constants.CLI_URL)
    public List<TableEn> getTableStatus(Boolean status) {
        return tableRepositoryIml.findByStatus(status);
    }
    // @GetMapping("/search-table")
    // public ResponseEntity<List<TableE>> searchTableByPosition(
    // @RequestParam(name = "page", required = false, defaultValue = Constants.PAGE)
    // Integer page,
    // @RequestParam(name = "size", required = false, defaultValue = Constants.SIZE)
    // Integer size,
    // @RequestParam(name = "sort", required = false, defaultValue = Constants.SORT)
    // String sort,
    // @RequestParam(name = "feild", required = false, defaultValue =
    // Constants.FEILD) String feild,
    // @RequestParam(name = "search", required = false) int search) {
    // Pageable pageable = PageRequest.of(page, size, Sorts.sort(sort, feild));
    // Page<TableE> pageContent = tableRepository.findByPosition(pageable, search);
    // HttpHeaders headers = PaginationUtil
    // .generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(),
    // pageContent);
    // return ResponseEntity.ok().headers(headers).body(pageContent.getContent());
    // }

    @GetMapping("/search-table-activated")
    @CrossOrigin(Constants.CLI_URL)
    public ResponseEntity<List<TableE>> searchTableByActivated(
            @RequestParam(name = "page", required = false, defaultValue = Constants.PAGE) Integer page,
            @RequestParam(name = "size", required = false, defaultValue = Constants.SIZE) Integer size,
            @RequestParam(name = "sort", required = false, defaultValue = Constants.SORT) String sort,
            @RequestParam(name = "feild", required = false, defaultValue = Constants.FEILD) String feild,
            @RequestParam(name = "search", required = false) Boolean search) {
        Pageable pageable = PageRequest.of(page, size, Sorts.sort(sort, feild));
        Page<TableE> pageContent = tableRepository.findByStatus(pageable, search);
        HttpHeaders headers = PaginationUtil
                .generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), pageContent);
        return ResponseEntity.ok().headers(headers).body(pageContent.getContent());
    }

    @GetMapping("/get-all-table-for-calendar/{status}")
    @CrossOrigin(Constants.CLI_URL)
    public List<TableEn> getAllTableForCalendar(@PathVariable("status") Boolean status) {
        return tableService.getAllForCalendar(status);
    }
}
