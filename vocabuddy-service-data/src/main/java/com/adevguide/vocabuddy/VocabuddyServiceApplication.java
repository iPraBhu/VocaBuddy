package com.adevguide.vocabuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VocabuddyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VocabuddyServiceApplication.class, args);
	}

}
