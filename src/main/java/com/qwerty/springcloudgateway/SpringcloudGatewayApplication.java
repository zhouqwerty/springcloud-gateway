package com.qwerty.springcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
/*
* zuul的重试在熔断之前，就是当重试全部失败后再调用熔断
* gateway的重试在熔断之后，就是只要出错就熔断，根本不会重试（个人测试所得，不一定准确）
* */
@SpringBootApplication
public class SpringcloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudGatewayApplication.class, args);
	}

}
