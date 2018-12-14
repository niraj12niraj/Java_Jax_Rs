package com.rest.jax.rs.service;

import java.util.List;

import com.rest.jax.rs.model.User;

public interface UserService {
	
	public String save(User user);
	public User editOrUpdate(User user);
	public List<User>getlist();
	public void merge(User user);
	public User getUser();
	public User getUserById();
	public User getCurrentUser();

}
