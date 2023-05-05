package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@GetMapping("/students/{studentId}/courses")
	public String display(@PathVariable int studentId )
	{
		return "Registration successful for "+studentId;
	}
	
	@GetMapping("/students/{studentId}/courses/{courseId}")
	public String display(@PathVariable int studentId,@PathVariable int courseId)
	{
		return "Registration successful for "+studentId+" for the course "+courseId;
	}
}
