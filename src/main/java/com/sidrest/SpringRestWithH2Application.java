package com.sidrest;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class SpringRestWithH2Application {

	public static Logger logger=LoggerFactory.getLogger(SpringRestWithH2Application.class);
	
	@PostConstruct
	public void initt() {
	   logger.info("Application started--------");
	}
	
	public static void main(String[] args) {
		logger.info("Application Executed--------");
		SpringApplication.run(SpringRestWithH2Application.class, args);
	}

}
