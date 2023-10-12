package com.example.demomvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemomvcApplication {

	public static void main(String[] args) {
		System.out.println("sysout  쓰고 ctrl + space");
		SpringApplication.run(DemomvcApplication.class, args);
		System.out.println("sysout  쓰고 ctrl + space_After");
	}

}
