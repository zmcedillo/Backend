package com.springboot.backend.app.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootServiceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceBackendApplication.class, args);
	}

}
