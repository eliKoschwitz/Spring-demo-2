package com.example.BasicBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BasicBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicBeansApplication.class, args);
	}

	@Bean
	public String getName() {
		return "Elias";
	}
}
