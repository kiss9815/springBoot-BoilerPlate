package com.boilerPlate.app.Controller;

import java.time.Duration;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import Util.DateUtil;
import Util.NumberUtil;
import reactor.core.publisher.Flux;

@RestController
public class StockPriceEventController {


	@GetMapping("/stocks/price/{stockCode}")
	Flux<String> retrieveStockPriceHardcoded(@PathVariable("stockCode") String stockCode) {
		return Flux.interval(Duration.ofSeconds(5)).map(l -> DateUtil.getCurrentDate() + " : " + NumberUtil.getRandomNumber(100, 125))
				.log();
	}

}
