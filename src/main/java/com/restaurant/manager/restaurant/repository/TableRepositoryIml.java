package com.restaurant.manager.restaurant.repository;

import java.sql.Date;
import java.util.List;

import com.restaurant.manager.restaurant.domain.TableEn;
import com.restaurant.manager.restaurant.service.dto.TableEnDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepositoryIml extends JpaRepository<TableEn, Long> {
    List<TableEnDTO> findByTimeBookingLikeAndStatus(Date date, Boolean status);

    List<TableEn> findByStatus(Boolean status);
}
