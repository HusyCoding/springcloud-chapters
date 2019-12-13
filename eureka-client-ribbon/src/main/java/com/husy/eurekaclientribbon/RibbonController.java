package com.husy.eurekaclientribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description: TODO
 * @author: husy
 * @date 2019/12/5
 */
@RestController
public class RibbonController {
	@Autowired
	LoadBalancerClient loadBalancerClient;
	@Autowired
	private RibbonService ribbonService;

	@GetMapping("/hi")
	public String hi(@RequestParam(required = false, defaultValue = "husy") String name) {
		return ribbonService.hi(name);
	}

	@GetMapping("/testInstance")
	public String testInstance() {
		ServiceInstance serviceInstance = this.loadBalancerClient.choose("eureka-client");
		// 打印当前选择的是哪个节点
		return "节点打印-->>"+ serviceInstance.getServiceId()+":"+ serviceInstance.getHost()+":"+ serviceInstance.getPort();
	}
}
