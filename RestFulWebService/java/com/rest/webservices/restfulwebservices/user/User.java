package com.rest.webservices.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {

	@Size(min=2 , message="Name should have 2 characters")
	private String name;
	private Integer id;
	
	@Past
	private Date bDate;

	protected User(){
		
	}
	public User(String name, int id, Date bDate) {
		this.name = name;
		this.id = id;
		this.bDate = bDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", id=" + id + ", bDate=" + bDate + "]";
	}

}
