package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookModel;
import com.example.demo.repository.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo repo;
	public List<BookModel> getAllBookModel()
	{
		List<BookModel> bList=repo.findAll();
		return bList;
	}
	public BookModel saveBook(BookModel bm)
	{
		BookModel ob=repo.save(bm);
		return ob;
	}
	public BookModel updateBook(BookModel bm)
	{
		BookModel ob=repo.save(bm);
		return ob;
		
	}
	public void deleteBook(int id)
	{
		repo.deleteById(id);
	}
	public BookModel getBook(int id)
	{
		BookModel bm=repo.findById(id).get();
		return bm;
	}
	public Optional<BookModel> getBookModelbyId(int id)
	{
		return repo.findById(id);
	}

}


