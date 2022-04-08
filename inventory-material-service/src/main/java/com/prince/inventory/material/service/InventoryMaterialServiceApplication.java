package com.prince.inventory.material.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InventoryMaterialServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryMaterialServiceApplication.class, args);
	}

}
