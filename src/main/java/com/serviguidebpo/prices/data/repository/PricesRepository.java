package com.serviguidebpo.prices.data.repository;

import java.time.LocalDateTime;

import org.springframework.data.repository.CrudRepository;

import com.serviguidebpo.prices.data.model.PricesModel;

public interface PricesRepository extends CrudRepository<PricesModel, Long> {

	PricesModel findFirstByStartDateBeforeAndEndDateAfterAndProductIdAndBrandIdOrderByPriorityDesc(LocalDateTime applicationDate1,
			LocalDateTime applicationDate2, Long productId, Long brandId);
}
