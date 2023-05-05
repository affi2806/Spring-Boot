package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.RepoInterface;

@Service
public class ServiceClass {
	
	@Autowired
	RepoInterface rep;
	
	public List<Book> getAll(Book b)
	{
		return rep.findAll();
	}
	
	public Optional<Book> getBook(int bookId)
	{
		return rep.findById(bookId);
	}
	
	public Book saveBook(Book b)
	{
		return rep.save(b);
	}
	

}
