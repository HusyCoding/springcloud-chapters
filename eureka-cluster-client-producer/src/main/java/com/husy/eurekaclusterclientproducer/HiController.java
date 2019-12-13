package com.husy.eurekaclusterclientproducer;

import org.springframework.beans.factory.annotation.Value;
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
	@Value("${server.port}")
	String port;
	@GetMapping("/hi")
	public String home(@RequestParam String name){
		return "hi "+name+",i am form port:"+port;
	}
}