package com.aj.devops_automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsAutomationApplication {

	@GetMapping("/")
	public String getMessage() {
		return "Welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsAutomationApplication.class, args);
	}

}
