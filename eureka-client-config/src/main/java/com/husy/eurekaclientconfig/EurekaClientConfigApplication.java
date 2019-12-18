package com.husy.eurekaclientconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@EnableEurekaClient
@RestController
@SpringBootApplication
public class EurekaClientConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientConfigApplication.class, args);
	}

	@Value("${word}")
	String word;

	@RequestMapping("/hi")
	public  String hi(){
		return word;
	}
}
