package com.rest.jax.rs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.rest.jax.rs.model.User;

public class UserServiceImpl implements UserService{
 
	private static  AtomicLong at;
	@Override
	public String save(User user) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public User editOrUpdate(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getlist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void merge(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getCurrentUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void dummyUserList() {
		Map<Integer, User>map=new HashMap<>();
		map.put((int) at.incrementAndGet(), new User("Raju",7484598742L,"Delhi","1011-01-11","ra@gmail.com","******"));
	}

}
