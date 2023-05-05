package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo rep;
	
	public Book updateBook(Book b)
	{
		return rep.save(b);	
	}
	
	public String deleteBook(int bookId)
	{
		rep.deleteById(bookId);
		return "Deletion succeful!";
	}

}
