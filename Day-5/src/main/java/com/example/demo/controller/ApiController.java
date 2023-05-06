package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	ApiService ser;
	
	@PostMapping("/")
	public Boolean saveProd(@RequestBody Product p)
	{
		return ser.saveProd(p);
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getProd(@PathVariable int id)
	{
		return ser.getProd(id);
	}
	
	@GetMapping("/")
	public List<Product> getAll()
	{
		return ser.getAll();
	}
	
	@PutMapping("/{id}")
	public Product updateProd(@PathVariable int id)
	{
		return ser.updateProd(id);
	}
	
	@DeleteMapping("/{id}")
	public Boolean deleteProd(@PathVariable int id)
	{
	     return ser.deleteProd(id);
	}
	

}
