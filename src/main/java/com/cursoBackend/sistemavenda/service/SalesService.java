package com.cursoBackend.sistemavenda.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoBackend.sistemavenda.domain.Sales;
import com.cursoBackend.sistemavenda.repository.SalesRepository;

@Service
public class SalesService {

	@Autowired
	private SalesRepository salesRepository;

	public List<Sales> findAll() {
		return salesRepository.findAll();
	}

	public List<Sales> findBySellerName(String sellerName) {
		return salesRepository.findBySellerName(sellerName);
	}

	public List<Sales> findByDate(Date beginDate, Date endDate) {
		return salesRepository.findByDateBetween(beginDate, endDate);
	}

}
