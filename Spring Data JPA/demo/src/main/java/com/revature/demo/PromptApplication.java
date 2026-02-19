package com.revature.demo;

import com.revature.demo.revfirst.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PromptApplication {

	public static void main(String[] args) {
		Employee emp = new Employee("101", "Ganpat Rao", 50000);
		System.out.println("Employee created");
		System.out.println(emp);
	}
}
