package com.restaurant.manager.restaurant.repository;

import com.restaurant.manager.restaurant.domain.TableE;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface TableRepository extends JpaRepository<TableE, Long> {
    //Page<TableE> findByPosition(Pageable pageable, int search);

    Page<TableE> findByStatus(Pageable pageable, Boolean search);
}
