package com.github.trungee.springbootmicroserviceforexservice.runner;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;

public class BeerInitializer implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		Stream.of("Kentucky Brunch Brand Stout", "Good Morning", "Very Hazy", "King Julius",
                "Budweiser", "Coors Light", "PBR").forEach(System.out::println);
		
	}

}
