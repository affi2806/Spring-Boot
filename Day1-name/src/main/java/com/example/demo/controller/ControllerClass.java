package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	public String name;
	@Value("${name}")
	
	@GetMapping("/Value")
	public String name()
	{
		return "Welcome "+name;
	}

}
