package com.husy.eurekaclientfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: TODO
 * @author: husy
 * @date 2019/12/6
 */
@Service
public class HiServiceImpl implements HiService {
	@Resource
	EurekaClientFeign eurekaClientFeign;

	@Override
	public String sayHi(String name) {
		return eurekaClientFeign.sayHi(name);
	}
}
