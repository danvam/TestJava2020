package com.serviguidebpo.prices.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviguidebpo.prices.data.model.Prices;
import com.serviguidebpo.prices.data.repository.PricesRepository;

@Service
public class PricesServiceImpl implements PricesService {

	@Autowired
	private PricesRepository pricesRepository;

	@Override
	public Prices getPrices(LocalDateTime applicationDate, Long productId, Long brandId) {

		return pricesRepository
				.findFirstByStartDateBeforeAndEndDateAfterAndProductIdAndBrandIdOrderByPriorityDesc(applicationDate,
						applicationDate, productId, brandId);
	}

}
