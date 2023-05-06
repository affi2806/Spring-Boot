package com.ex.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ex.demo.model.Child;
import com.ex.demo.repository.ChildRepo;

@Service
public class ApiService {
	
	@Autowired
	ChildRepo rep;
	
	public Boolean saveBaby(Child c)
	{
		if(rep.save(c)!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	 public List<Child> sortBaby(String field) 

	 {
		   return rep.findAll(Sort.by(field));
	 } 

	 public List<Child> pagingBaby(int offset,int pageSize) 

	 {

		   Pageable paging=PageRequest.of(offset,pageSize);

		   Page<Child> babyData=rep.findAll(paging);

		   List<Child>babyList=babyData.getContent(); 

		   return babyList;

	 }
	 
	 public List<Child> PagingAndSorting(int offset,int pagesize,String field)
	 {
		 Pageable paging=PageRequest.of(pagesize, pagesize).withSort(Sort.by(field));
		 Page<Child> baby=rep.findAll(paging);
		 return baby.getContent();
	 }
}

