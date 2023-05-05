package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
public class ControllerClass {
	
	@Autowired
	BookService serv;
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book b)
	{
	return serv.updateBook(b);
	}
	
	@DeleteMapping("/book/{bookId}")
	public String deleteBook(@PathVariable int bookId)
	{
	   return  serv.deleteBook(bookId);
	   
	}
	

}
