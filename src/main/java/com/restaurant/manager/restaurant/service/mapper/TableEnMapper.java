package com.restaurant.manager.restaurant.service.mapper;

import java.util.List;

import com.restaurant.manager.restaurant.domain.TableEn;
import com.restaurant.manager.restaurant.service.dto.TableEnDTO;

import org.springframework.stereotype.Service;

@Service
public class TableEnMapper {
    public TableEnDTO toDTO(TableEn entity){
        TableEnDTO dto = new TableEnDTO();
        dto.setTable_origin_id(entity.getTableId());
        return dto;
    }
}
