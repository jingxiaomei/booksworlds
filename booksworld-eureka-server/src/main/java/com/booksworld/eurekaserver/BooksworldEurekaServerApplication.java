package com.booksworld.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BooksworldEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksworldEurekaServerApplication.class, args);
	}
}
