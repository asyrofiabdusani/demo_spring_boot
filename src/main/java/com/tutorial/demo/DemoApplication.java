package com.tutorial.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private static final String MESSAGE = "Hello World!";

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(MESSAGE);
	}

	public String getMessage() {
		return MESSAGE;
	}
}
