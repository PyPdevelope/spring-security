package com.varun.spring_security;

import com.varun.spring_security.model.Employee;
import com.varun.spring_security.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(EmployeeRepository repo) {
		return args -> {
			repo.save(new Employee("John Doe", "Developer", "IT"));
			repo.save(new Employee("Jane Smith", "Manager", "HR"));
			repo.save(new Employee("Mike Johnson", "Analyst", "Finance"));
		};
	}
}
