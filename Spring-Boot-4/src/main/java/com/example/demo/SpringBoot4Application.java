package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class SpringBoot4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot4Application.class, args);
		System.out.println("Applicaiton running !");
	}
	
	
	

}
