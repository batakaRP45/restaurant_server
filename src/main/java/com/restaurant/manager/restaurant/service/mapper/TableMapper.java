package com.restaurant.manager.restaurant.service.mapper;

import java.util.ArrayList;
import java.util.List;

import com.restaurant.manager.restaurant.domain.Customer;
import com.restaurant.manager.restaurant.domain.TableE;
import com.restaurant.manager.restaurant.domain.TableOrigin;
import com.restaurant.manager.restaurant.service.dto.TableDTO;

import org.springframework.stereotype.Service;

@Service
public class TableMapper {
    public TableDTO tabletoTableDTO(TableE entity) {
        if (entity == null)
            return null;
        else {
            TableDTO dto = new TableDTO();
            dto.setId(entity.getId());
            dto.setStatus(entity.isStatus());
            // dto.setTableOriginId(entity.getTableOriginId());
            dto.setCustomer_id(tableCustomerId(entity));
            dto.setCustomer_name(tableCustomerName(entity));
            dto.setCustomer_phone(tableCustomerPhone(entity));
            dto.setCustomer_email(tableCustomerEmail(entity));
            dto.setCustomer_address(tableCustomerAddress(entity));
            dto.setTable_Origin_Id(tableTableOriginId(entity));
            dto.setTable_Origin_position(tableTableOriginPosition(entity));
            dto.setTable_Origin_quantity(tableTableOriginQuantity(entity));
            dto.setTimeCreated(entity.getTimeCreated());
            dto.setTimeBooking(entity.getTimeBooking());
            return dto;
        }
    }

    public TableE tableDTOtoTableE(TableDTO dto) {
        if (dto == null)
            return null;
        else {
            TableE entity = new TableE();
            entity.setId(dto.getId());
            entity.setStatus(dto.isStatus());
            // entity.setTableOriginId(dto.getTableOriginId());
            entity.setCustomer(tableDTOtoCustomer(dto));
            entity.setTableOrigin(tableDTOtoTableOrigin(dto));
            entity.setTimeCreated(dto.getTimeCreated());
            entity.setTimeBooking(dto.getTimeBooking());
            return entity;
        }
    }

    public TableE toEntity(TableDTO dto) {
        if (dto == null)
            return null;
        else {
            TableE entity = new TableE();
            entity.setId(dto.getId());
            entity.setStatus(dto.isStatus());
            // entity.setTableOriginId(dto.getTableOriginId());
            entity.setTimeCreated(dto.getTimeCreated());
            entity.setTimeBooking(dto.getTimeBooking());
            return entity;
        }
    }

    public TableE tableUpdate(TableDTO dto, TableE entity) {
        if (dto == null)
            return null;
        else {
            entity.setStatus(dto.isStatus());
            entity.setCustomer(tableDTOtoCustomer(dto));
            return entity;
        }
    }

    public List<TableDTO> listTableMapper(List<TableE> list) {
        if (list == null)
            return null;
        List<TableDTO> dtolist = new ArrayList<>();
        list.forEach(t -> dtolist.add(tabletoTableDTO(t)));
        return dtolist;
    }

    private Long tableCustomerId(TableE tableE) {
        if (tableE == null) {
            return null;
        }
        Customer customer = tableE.getCustomer();
        if (customer == null) {
            return null;
        }
        Long id = customer.getId();
        if (id == null) {
            return null;
        }
        return id;
    }

    private String tableCustomerName(TableE tableE) {
        if (tableE == null) {
            return null;
        }
        Customer customer = tableE.getCustomer();
        if (customer == null) {
            return null;
        }
        String name = customer.getName();
        if (name == null) {
            return null;
        }
        return name;
    }

    private String tableCustomerPhone(TableE tableE) {
        if (tableE == null) {
            return null;
        }
        Customer customer = tableE.getCustomer();
        if (customer == null) {
            return null;
        }
        String phone = customer.getPhone_number();
        if (phone == null) {
            return null;
        }
        return phone;
    }

    private String tableCustomerEmail(TableE tableE) {
        if (tableE == null) {
            return null;
        }
        Customer customer = tableE.getCustomer();
        if (customer == null) {
            return null;
        }
        String email = customer.getEmail();
        if (email == null) {
            return null;
        }
        return email;
    }

    private String tableCustomerAddress(TableE tableE) {
        if (tableE == null) {
            return null;
        }
        Customer customer = tableE.getCustomer();
        if (customer == null) {
            return null;
        }
        String address = customer.getAddress();
        if (address == null) {
            return null;
        }
        return address;
    }

    protected Customer tableDTOtoCustomer(TableDTO dto) {
        if (dto == null)
            return null;
        Customer customer = new Customer();
        customer.setId(dto.getCustomer_id());
        customer.setName(dto.getCustomer_name());
        customer.setPhone_number(dto.getCustomer_phone());
        customer.setEmail(dto.getCustomer_email());
        customer.setAddress(dto.getCustomer_address());
        return customer;
    }

    protected TableOrigin tableDTOtoTableOrigin(TableDTO dto) {
        if (dto == null)
            return null;
        TableOrigin tableOrigin = new TableOrigin();
        tableOrigin.setId(dto.getTable_Origin_Id());
        tableOrigin.setPosition(dto.getTable_Origin_position());
        tableOrigin.setPeopleQuantity(dto.getTable_Origin_quantity());
        return tableOrigin;
    }

    private Long tableTableOriginId(TableE tableE) {
        if (tableE == null) {
            return null;
        }
        TableOrigin tableOrigin = tableE.getTableOrigin();
        if (tableOrigin == null) {
            return null;
        }
        Long id = tableOrigin.getId();
        if (id == null)
            return null;
        return id;
    }

    private int tableTableOriginPosition(TableE tableE) {
        if (tableE == null) {
            return 0;
        }
        TableOrigin tableOrigin = tableE.getTableOrigin();
        if (tableOrigin == null) {
            return 0;
        }
        int position = tableOrigin.getPosition();
        if (position < 0)
            return 0;
        return position;
    }

    private int tableTableOriginQuantity(TableE tableE) {
        if (tableE == null) {
            return 0;
        }
        TableOrigin tableOrigin = tableE.getTableOrigin();
        if (tableOrigin == null) {
            return 0;
        }
        int quantity = tableOrigin.getPeopleQuantity();
        if (quantity < 0)
            return 0;
        return quantity;
    }
}
