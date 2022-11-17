package com.cursoBackend.sistemavenda.repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursoBackend.sistemavenda.domain.Sales;

@Repository("SalesRepository")
public interface SalesRepository extends JpaRepository<Sales, UUID> {

	List<Sales> findBySellerName(String sellerName);

	List<Sales> findByDateBetween(Date beginDate, Date endDate);
}
