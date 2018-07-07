package com.github.trungee.springbootmicroserviceforexservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.trungee.springbootmicroserviceforexservice.domain.ExchangeValue;
import com.github.trungee.springbootmicroserviceforexservice.repository.ExchangeValueRepository;

@RestController(value="rest")
public class ForexController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue (@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("server.port")));
		return exchangeValue;
	}
	
	@GetMapping("exchanges")
	public List<ExchangeValue> getAll() {
		return repository.findAll();
	}
		
}
