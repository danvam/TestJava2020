package com.serviguidebpo.prices.service;

import java.time.LocalDateTime;

import com.serviguidebpo.prices.data.model.Prices;

public interface PricesService {

	public Prices getPrices(LocalDateTime applicationDate, Long productId, Long brandId);

}
