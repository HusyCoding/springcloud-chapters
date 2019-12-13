package com.husy.eurekaclusterclientproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClusterClientProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClusterClientProducerApplication.class, args);
	}
}
