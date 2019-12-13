package com.husy.eurekaclientribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @description: TODO
 * @author: husy
 * @date 2019/12/5
 */
@Service
public class RibbonServiceImpl implements RibbonService {
	@Autowired
	RestTemplate restTemplate;

	@Override
	@GetMapping("/hi")
	@HystrixCommand(fallbackMethod = "hiError")
	public String hi(@RequestParam(required = false, defaultValue = "husy") String name) {
		return restTemplate.getForObject("http://eureka-client-producer/hi?name=" + name, String.class);
	}

	public String hiError(String name){
		return "hi," + name + ",sorry,error !!!";
	}
}
