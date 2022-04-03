package com.example.protectedservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProtectedServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProtectedServiceApplication.class, args);
	}

}
