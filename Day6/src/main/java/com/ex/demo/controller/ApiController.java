package com.ex.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex.demo.model.Child;
import com.ex.demo.service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	ApiService stud;
	
	
	    @PostMapping("/")
	    public Boolean saveBaby(@RequestBody Child c)
	    {
	    	return stud.saveBaby(c);
	    }
	    
	   @GetMapping("/{field}")
	   public List<Child>sortBaby(@PathVariable String field) 

	   { 
		   return stud.sortBaby(field); 
	   }

	   ///pagination
	   @GetMapping("/{offset}/{pageSize}")
	   public List<Child> pagingBaby(@PathVariable int offset,@PathVariable int pageSize)

	   {
		   return stud.pagingBaby(offset,pageSize); 
	   }
	   
	    
	   @GetMapping("/{offset}/{pagesize}/{field}")
	   public List<Child> PagingAndSorting(@PathVariable int offset, @PathVariable int pagesize, @PathVariable String field)
	   {
		   return stud.PagingAndSorting(offset, pagesize, field);
	   }

}
