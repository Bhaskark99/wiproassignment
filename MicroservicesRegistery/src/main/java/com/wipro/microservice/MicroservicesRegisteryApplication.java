package com.wipro.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesRegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesRegisteryApplication.class, args);
	}

}
