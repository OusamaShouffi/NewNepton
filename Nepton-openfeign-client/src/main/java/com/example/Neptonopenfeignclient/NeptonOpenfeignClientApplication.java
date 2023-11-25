package com.example.Neptonopenfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NeptonOpenfeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeptonOpenfeignClientApplication.class, args);
	}

}
