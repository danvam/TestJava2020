package com.serviguidebpo.prices.service;

import java.time.LocalDateTime;

import com.serviguidebpo.prices.dto.Prices;
import com.serviguidebpo.prices.mapper.PricesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviguidebpo.prices.repository.PricesRepository;

@Service
public class PricesServiceImpl implements PricesService {

	@Autowired
	private PricesRepository pricesRepository;

	@Autowired
	PricesMapper pricesMapper;

	@Override
	public Prices getPrices(LocalDateTime applicationDate, Long productId, Long brandId) {

		return pricesMapper.pricesModelToPrices(pricesRepository
				.findFirstByStartDateBeforeAndEndDateAfterAndProductIdAndBrandIdOrderByPriorityDesc(applicationDate,
						applicationDate, productId, brandId)) ;
	}

}
