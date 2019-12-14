package com.husy.eurekaclientribbon;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;


@EnableHystrix
@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientHystrixRibbonApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientHystrixRibbonApplication.class, args);
	}

	/**
	 * springboot 版本如果是2.0则需要添加 ServletRegistrationBean
	 * 因为springboot的默认路径不是 "/hystrix.stream"
	 * 或者 properties 中添加 management.endpoints.web.xposure.include = hystrix.stream
	 * @return
	 */
	@Bean
	public ServletRegistrationBean getServlet(){
		HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
		registrationBean.setLoadOnStartup(1);
		registrationBean.addUrlMappings("/hystrix.stream");
		registrationBean.setName("HystrixMetricsStreamServlet");
		return registrationBean;
	}
}
