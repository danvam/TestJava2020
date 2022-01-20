package com.serviguidebpo.prices.data.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRICES")
public class Prices {
	
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
	private Currency curr;

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Long getPriceList() {
		return priceList;
	}

	public void setPriceList(Long priceList) {
		this.priceList = priceList;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Currency getCurr() {
		return curr;
	}

	public void setCurr(Currency curr) {
		this.curr = curr;
	}

}
