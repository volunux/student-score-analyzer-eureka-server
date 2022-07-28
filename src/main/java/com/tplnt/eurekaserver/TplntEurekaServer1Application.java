package com.tplnt.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@RefreshScope
public class TplntEurekaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(TplntEurekaServer1Application.class, args);
	}

}
