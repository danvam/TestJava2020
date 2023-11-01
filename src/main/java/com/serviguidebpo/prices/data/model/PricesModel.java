package com.serviguidebpo.prices.data.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRICES")
@Getter
@Setter
public class PricesModel {
	
	@Column(name = "BRAND_ID")
	private Long brandId;
	
	@Column(name = "START_DATE")
	private LocalDateTime  startDate;
	
	@Column(name = "END_DATE")
	private LocalDateTime endDate;
	
	@Id
	@Column(name = "PRICE_LIST")
	private Long priceList;
	
	@Column(name = "PRODUCT_ID")
	private Long productId;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "CURR")
	@Enumerated(EnumType.STRING)
	private CurrencyModel curr;

}
