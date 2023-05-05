package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	
	public String color;
	@Value("${color}")
	
	@GetMapping("/")
	public String getMyFav()
	{
		return "My favorite color "+color;
	}

}
