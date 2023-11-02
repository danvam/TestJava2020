package com.serviguidebpo.prices.service;

import java.time.LocalDateTime;

import com.serviguidebpo.prices.dto.Prices;

public interface PricesService {

	Prices getPrices(LocalDateTime applicationDate, Long productId, Long brandId);

}
