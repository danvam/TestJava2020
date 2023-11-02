package com.serviguidebpo.prices.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Prices {
	
	private Long brandId;
	private LocalDateTime  startDate;
	private LocalDateTime endDate;
	private Long priceList;
	private Long productId;
	private Integer priority;
	private Double price;
	private Currency curr;

}
