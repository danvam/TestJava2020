package com.serviguidebpo.prices;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@AutoConfigureMockMvc
@SpringBootTest(classes = PricesApplication.class)
class PricesApplicationTests {

	@Autowired
	private MockMvc mvc;


	/**
	 * Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	 * @throws Exception
	 */
	@Test
	public void givenDateBrandAndProduct_whenGetPrices_thenReturnUniquePriceCase1() throws Exception {

		mvc.perform(get("/api/prices?applicationDate=2020-06-14T10:00:00.000-01:00&productId=35455&brandId=1")
				.contentType(MediaType.APPLICATION_JSON))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.priceList", CoreMatchers.is(1)));
	}
	
	/**
	 * Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	 * @throws Exception
	 */
	@Test
	public void givenDateBrandAndProduct_whenGetPrices_thenReturnMaxPriorityOverlappedPriceCase2() throws Exception {

		mvc.perform(get("/api/prices?applicationDate=2020-06-14T16:00:00.000-01:00&productId=35455&brandId=1")
				.contentType(MediaType.APPLICATION_JSON))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.priceList", CoreMatchers.is(2)));
	}
	
	/**
	 * Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	 * @throws Exception
	 */
	@Test
	public void givenDateBrandAndProduct_whenGetPrices_thenReturnMaxPriorityOverlappedPriceCase3() throws Exception {

		mvc.perform(get("/api/prices?applicationDate=2020-06-14T21:00:00.000-01:00&productId=35455&brandId=1")
				.contentType(MediaType.APPLICATION_JSON))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.priceList", CoreMatchers.is(1)));
	}

	/**
	 * Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
	 * @throws Exception
	 */
	@Test
	public void givenDateBrandAndProduct_whenGetPrices_thenReturnMaxPriorityOverlappedPriceCase4() throws Exception {

		mvc.perform(get("/api/prices?applicationDate=2020-06-15T10:00:00.000-01:00&productId=35455&brandId=1")
				.contentType(MediaType.APPLICATION_JSON))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.priceList", CoreMatchers.is(3)));
	}
	
	/**
	 * Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
	 * @throws Exception
	 */
	@Test
	public void givenDateBrandAndProduct_whenGetPrices_thenReturnMaxPriorityOverlappedPriceCase5() throws Exception {

		mvc.perform(get("/api/prices?applicationDate=2020-06-16T21:00:00.000-01:00&productId=35455&brandId=1")
				.contentType(MediaType.APPLICATION_JSON))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.priceList", CoreMatchers.is(4)));
	}
}
