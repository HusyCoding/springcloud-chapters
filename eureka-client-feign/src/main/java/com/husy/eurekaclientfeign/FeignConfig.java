package com.husy.eurekaclientfeign;

import feign.Retryer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @description: Feign 配置
 * @author: husy
 * @date 2019/12/5
 */
@Configuration
public class FeignConfig {
	@Bean
	public Retryer feignRertyer() {
		return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 5);
	}
}
