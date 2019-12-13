package com.husy.eurekaclienthystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientHystrixApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientHystrixApplication.class, args);
	}
}
