package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsIntegrationApplication.class, args);
	}
	
	@GetMapping("/")
	public String getMessage() {
		return "Hello World..Welcome to JENKINS!!!!!";
	}
}
