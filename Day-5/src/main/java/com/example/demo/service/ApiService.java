package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ApiService {

	@Autowired
	ProductRepository rep;
	
	public Boolean saveProd(Product p)
	{
		if(rep.save(p)!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Optional<Product> getProd(int id)
	{
		return rep.findById(id);
	}
	
	public List<Product> getAll()
	{
		return rep.findAll();
	}
	
	public Product updateProd(int id)
	{
		Optional<Product> optional=rep.findById(id);
		Product ob=null;
		if(optional.isPresent())
		{
			ob=optional.get();
			rep.save(ob);
		}
		return ob;
	}
	
	public Boolean deleteProd(int id)
	{
		Optional<Product> optional=rep.findById(id);
		if(optional.isPresent())
		{
			rep.deleteById(id);
			return true;
		}
		else
			return false;
	}
	
}
