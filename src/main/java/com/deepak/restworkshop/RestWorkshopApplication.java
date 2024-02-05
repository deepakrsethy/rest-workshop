package com.deepak.restworkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestWorkshopApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/rest-workshop");
		SpringApplication.run(RestWorkshopApplication.class, args);
	}

}
