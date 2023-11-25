package com.example.Neptonopenfeignclientribboneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class NeptonOpenfeignClientRibbonEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeptonOpenfeignClientRibbonEurekaApplication.class, args);
	}

}
