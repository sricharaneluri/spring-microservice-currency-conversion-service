package com.hcl.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currency-exchange-services", url="localhost:8000")
//@FeignClient(name="currency-exchange-services")
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-services")
public interface CurrencyExchangeServiceProxy {
	//@GetMapping("/currency-exchange/form/{from}/to/{to}")
	@GetMapping("/currency-exchange-services/currency-exchange/form/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue
	(@PathVariable("from") String from, @PathVariable("to") String to);
	

}
