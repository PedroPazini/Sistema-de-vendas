package com.cursoBackend.sistemavenda.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoBackend.sistemavenda.domain.Sales;
import com.cursoBackend.sistemavenda.service.SalesService;

@RestController
@RequestMapping(path = "api/sales")
public class SalesController {

	@Autowired
	private SalesService salesService;

	@GetMapping(path = "")
	public ResponseEntity<List<Sales>> allSales() {
		return ResponseEntity.status(HttpStatus.OK).body(salesService.findAll());
	}

	@GetMapping(path = "/{sellerName}")
	public ResponseEntity<List<Sales>> salesByName(@PathVariable String sellerName) {
		return ResponseEntity.status(HttpStatus.OK).body(salesService.findBySellerName(sellerName));
	}

	@GetMapping(path = "/{beginDate}/{endDate}")
	public ResponseEntity<List<Sales>> salesByDate(@PathVariable String beginDate, @PathVariable String endDate) {
		Date bDate = new Date();
		Date eDate = new Date();
		try {
			bDate = new SimpleDateFormat("yyyy-MM-dd").parse(beginDate);
			eDate = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
		} catch (Exception e) {
		}
		return ResponseEntity.status(HttpStatus.OK).body(salesService.findByDate(bDate, eDate));
	}

}
