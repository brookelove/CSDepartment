package com.example.CSDepartment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsDepartmentApplication {

	public static void main(String[] args) {
		System.out.println("Open http://localhost:8888 in browser");
		SpringApplication.run(CsDepartmentApplication.class, args);
	}

}