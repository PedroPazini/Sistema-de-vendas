package com.cursoBackend.sistemavenda.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_sales")
@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Sales implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "seller_name")
	private String sellerName;

	private Integer visited;
	private Double deals;
	private Double amount;
	private Date date;

	public Sales() {

	}

}
