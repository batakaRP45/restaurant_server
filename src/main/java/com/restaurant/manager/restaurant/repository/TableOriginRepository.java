package com.restaurant.manager.restaurant.repository;

import java.util.List;

import com.restaurant.manager.restaurant.domain.TableOrigin;
import com.restaurant.manager.restaurant.service.dto.TableEnDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableOriginRepository extends JpaRepository<TableOrigin, Long>{
    List<TableOrigin> findByIdNotIn(List<Long> list);
}
