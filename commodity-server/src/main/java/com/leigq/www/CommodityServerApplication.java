package com.leigq.www;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient
@EnableFeignClients
// 下面 3 个注释掉，使用 @SpringCloudApplication 组合注解
//@EnableCircuitBreaker
//@SpringBootApplication
//@EnableEurekaClient
//  @SpringCloudApplication 组合注解 看源码 包含 @SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker(断路器)
// @EnableDiscoveryClient与@EnableEurekaClient区别：https://www.jianshu.com/p/f6db3117864f
@SpringCloudApplication
@EnableHystrixDashboard
public class CommodityServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommodityServerApplication.class, args);
	}

}
