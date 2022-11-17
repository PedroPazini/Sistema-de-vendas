package com.cursoBackend.sistemavenda.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class SalesDto {

	private String sellerName;
	private Integer visited;
	private Double deals;
	private Double amount;
	private Date date;

	public SalesDto() {

	}

}
