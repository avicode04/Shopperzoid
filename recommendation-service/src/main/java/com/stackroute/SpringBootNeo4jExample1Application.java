package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootNeo4jExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNeo4jExample1Application.class, args);
	}
}
