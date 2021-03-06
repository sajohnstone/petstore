package com.petstore.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.petstore")
@SpringBootApplication
public class PetstoreWebApplication {

	public static void main(String[] args) {
    SpringApplication.run(PetstoreWebApplication.class, args);
    System.out.println("Application started...");
	}

}
