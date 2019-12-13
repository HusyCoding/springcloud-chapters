package com.husy.eurekaclienthystrix;

import org.springframework.stereotype.Component;

/**
 * @description: 熔断器处理类
 * @author: husy
 * @date 2019/12/6
 */
@Component
public class HiHystrix implements EurekaClientFeign {
	@Override
	public String sayHi(String name) {
		return "hi," + name + ",sorry,error !!!";
	}
}
