package com.us.improve.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UsRegistryCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsRegistryCenterApplication.class, args);
	}

}

