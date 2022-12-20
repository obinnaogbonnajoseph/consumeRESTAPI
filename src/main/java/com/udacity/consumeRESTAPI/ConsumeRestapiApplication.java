package com.udacity.consumeRESTAPI;

import com.udacity.consumeRESTAPI.dao.CurrencyListResponse;
import com.udacity.consumeRESTAPI.dao.CurrencyResponse;
import com.udacity.consumeRESTAPI.entity.Currency;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeRestapiApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumeRestapiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumeRestapiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			CurrencyResponse response = restTemplate.getForObject(
					"https://api.coincap.io/v2/rates/ethereum", CurrencyResponse.class);

			var currenciesResponse = restTemplate.getForObject(
					"https://api.coincap.io/v2/rates", CurrencyListResponse.class);


			assert response != null && response.getData() != null;
			log.info("*** response to bitcoin rate *** " + response.toString());
			assert currenciesResponse != null;
			log.info("**** response to rates *** " + currenciesResponse.getData().size()
					+ " " + currenciesResponse.getData().get(5));
		};
	}
}
