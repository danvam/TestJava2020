package com.serviguidebpo.prices.mapper;

import com.serviguidebpo.prices.model.PricesModel;
import com.serviguidebpo.prices.dto.Prices;
import org.mapstruct.Mapper;

@Mapper
public interface PricesMapper {

    Prices pricesModelToPrices(PricesModel sendPayment);
}
