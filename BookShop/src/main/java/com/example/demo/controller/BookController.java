package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookModel;
import com.example.demo.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService ser;
	
	@PostMapping(value="/saveBook")
	public BookModel saveBook(@RequestBody BookModel bm)
	{
	return ser.saveBook(bm);
	}
	
	@PutMapping(value="/updateBook")
	public BookModel updateBook(@RequestBody BookModel bm)
	{
	return ser.updateBook(bm);
	}
	
	@DeleteMapping(value="/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") int id)
	{
	     ser.deleteBook(id);
	     return "Deletion successful";
	}
	
	@GetMapping(value="/getBook/{id}")
	public BookModel getBook(@PathVariable("id") int id)
	{
	return ser.getBook(id);
	}

}
