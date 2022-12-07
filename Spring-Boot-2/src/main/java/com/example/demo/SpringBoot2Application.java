package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * @Configuration
 * @EnableAutoConfiguration
 * @ComponentScan
 */
public class SpringBoot2Application implements ApplicationRunner,CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2Application.class, args);
	}

	@Override//ApplicationRunner
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Run from Applicationrunner invoked!!");
		
	}

	@Override //CommandLineRunner
	public void run(String... args) throws Exception {
		System.out.println("Run from commandrunner invoked ");
		
	}

}

