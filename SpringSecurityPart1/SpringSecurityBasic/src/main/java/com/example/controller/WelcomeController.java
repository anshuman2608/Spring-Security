package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String WelcomeFunction() {
		
		return "Welcome to springBoot with Security using spring security";
	}

}
