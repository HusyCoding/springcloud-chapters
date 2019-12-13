package com.husy.eurekaclientfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: husy
 * @date 2019/12/5
 */
@RestController
public class HiController {
	@Autowired
	HiService hiService;

	@GetMapping("/hi")
	public String sayHi(@RequestParam(defaultValue = "husy",required = false)String name ){
		return hiService.sayHi(name);
	}
}
