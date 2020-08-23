package com.udacity.doglists.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UdacityDogListsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdacityDogListsApplication.class, args);
	}

}
