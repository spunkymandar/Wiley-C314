package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	Logger logger=LoggerFactory.getLogger(SpringBoot4Application.class);
	
	@Scheduled(fixedRate = 1000)
	public void continuousTask() {
		System.out.println("Task is executing!!");
		logger.info("Repeted task is getting executed!!");
	}
}
