package com.husy.eurekaclientproducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: husy
 * Created by 2019/11/1
 */
@RestController
public class HiController {
	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String Hello(@RequestParam String name) {
		return "Hello " + name + ",There port is " + port;
	}
}
