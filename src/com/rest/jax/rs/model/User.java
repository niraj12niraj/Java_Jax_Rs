package com.rest.jax.rs.model;

import java.sql.Date;

public class User {
	int id;
	String name="rajesh";
	String address;
	Date dob;
	Long mobile;
	String email;
	String password="abc";
	public User(String name, long mobile, String address, String dob, String email, String password) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.mobile=mobile;
		this.address=address;
		this.dob=Date.valueOf(dob);
		this.email=email;
		this.password=password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
