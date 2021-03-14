package com.adevguide.vocabuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VocabuddyServiceDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(VocabuddyServiceDataApplication.class, args);
	}

}
