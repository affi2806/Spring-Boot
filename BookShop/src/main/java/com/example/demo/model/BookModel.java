package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class BookModel {
	
	@Id
	public int id;
	private String bname;
	private String author;
	private float price;
	private String btype;
	private String bnum;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public String getBnum() {
		return bnum;
	}
	public void setBnum(String bnum) {
		this.bnum = bnum;
	}
	

}
