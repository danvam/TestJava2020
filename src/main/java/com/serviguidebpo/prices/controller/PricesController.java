package com.serviguidebpo.prices.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.serviguidebpo.prices.data.model.Prices;
import com.serviguidebpo.prices.service.PricesService;

@RestController
public class PricesController {

	@Autowired
	private PricesService pricesService;

	@GetMapping("/api/prices")
	public Prices getPrices(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate, @RequestParam Long productId,
			@RequestParam Long brandId) {

		return pricesService.getPrices(applicationDate, productId, brandId);

	}
}
