package com.ex.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex.demo.model.Child;

@Repository
public interface ChildRepo extends JpaRepository<Child,Integer>{

}
