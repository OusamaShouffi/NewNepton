package com.example.Neptonservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NeptonServerEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(NeptonServerEurekaApplication.class, args);
	}
}
