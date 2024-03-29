package com.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsDemo1001Application {
	public static void main(String[] args) {
		SpringApplication.run(MsDemo1001Application.class, args);
	}

}
