package com.vamsi.restfullwebservices;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class RestfullWebservicesApplication {
	@Bean
	public ModelMapper modelmapper() {
		ModelMapper modelmapper=new ModelMapper();
		return modelmapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(RestfullWebservicesApplication.class, args);
	}

}
