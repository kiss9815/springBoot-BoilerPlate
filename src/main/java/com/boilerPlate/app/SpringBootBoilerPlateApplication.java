package com.boilerPlate.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
	
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})  // Datasource설정은 자동설정에서 제외 
@ComponentScan(basePackages = "com.boilerPlate.app")
public class SpringBootBoilerPlateApplication {

	public static void main(String[] args) {			
		SpringApplication.run(SpringBootBoilerPlateApplication.class, args);
		System.out.println("main start");
	}	

}

