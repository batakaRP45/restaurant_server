package com.restaurant.manager.restaurant.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.manager.restaurant.domain.TableE;
import com.restaurant.manager.restaurant.domain.TableEn;
import com.restaurant.manager.restaurant.domain.TableOrigin;
import com.restaurant.manager.restaurant.repository.TableRepository;
import com.restaurant.manager.restaurant.repository.TableRepositoryIml;
import com.restaurant.manager.restaurant.service.dto.TableDTO;
import com.restaurant.manager.restaurant.service.dto.TableEnDTO;
import com.restaurant.manager.restaurant.service.mapper.TableEnMapper;
import com.restaurant.manager.restaurant.service.mapper.TableMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TableService {
    @Autowired
    private TableRepository tableRepository;
    @Autowired
    private TableRepositoryIml tableRepositoryIml;
    @Autowired
    private TableMapper tableMapper;
    @Autowired
    private TableEnMapper tableEnMapper;

    public List<TableE> listTable() {
        return tableRepository.findAll();
    }

    public TableEn save(TableEn tableEn) {
        // TableE entity = tableMapper.toEntity(dto);
        // entity = tableRepository.save(entity);
        // return tableMapper.tabletoTableDTO(entity);
        return tableRepositoryIml.save(tableEn);
    }

    public List<TableEnDTO> getUseTable(Date date) {
        return tableRepositoryIml.findByTimeBookingLikeAndStatus(date, true);
    }

    public TableDTO update(TableDTO dto) {
        TableE oentity;
        oentity = tableRepository.getOne(dto.getId());
        TableE entity = tableMapper.tableUpdate(dto, oentity);
        entity = tableRepository.save(entity);
        return tableMapper.tabletoTableDTO(entity);
    }

    public void delete(TableDTO dto) {
        tableRepository.deleteById(dto.getId());
    }

    public List<Long> getAllStatus(Boolean status, String date) {
        List<TableEn> list = tableRepositoryIml.findByStatus(status);
        List<Long> listDTO = new ArrayList<>();
        listDTO.add(0L);
        list.forEach(val -> {
            if (val.getTimeBooking().toString().contains(date.trim())) {
                listDTO.add(val.getTableId());
            }
        });
        return listDTO;
    }

    public List<TableEn> getAllForCalendar(Boolean status) {
        return tableRepositoryIml.findByStatus(status);
    }
}
