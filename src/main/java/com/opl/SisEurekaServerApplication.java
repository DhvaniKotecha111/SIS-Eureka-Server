package com.opl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SisEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisEurekaServerApplication.class, args);
	}

}
