package com.myProject.restEasyFoodOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//@EnableScheduling
@EnableAsync
public class RestEasyFoodOrderApplication {
	
	public static void main(String[] args) {	
		SpringApplication.run(RestEasyFoodOrderApplication.class, args);
	}

}
