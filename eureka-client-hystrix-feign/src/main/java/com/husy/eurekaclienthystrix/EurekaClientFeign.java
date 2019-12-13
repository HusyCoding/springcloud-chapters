package com.husy.eurekaclienthystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: TODO
 * @author: husy
 * @date 2019/12/5
 */
@FeignClient(value = "eureka-client-producer", configuration = FeignConfig.class,fallback = HiHystrix.class )
public interface EurekaClientFeign {
	@GetMapping(value = "/hi")
	String sayHi(@RequestParam(name = "name") String name);
}
