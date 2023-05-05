package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.ServiceClass;

@RestController
public class ControllerClass {
	
	@Autowired
	ServiceClass serv;
	
	@GetMapping("/book")
	public List<Book> getAll(Book b)
	{
		return serv.getAll(b);
	}
	
	@GetMapping("/book/{bookId}")
	public Optional<Book> getBook(int bookId)
	{
		return serv.getBook(bookId);
	}
	
	@PostMapping("/books")
	public Book saveBook(@RequestBody Book b )
	{
		return serv.saveBook(b);
	}
	

}
