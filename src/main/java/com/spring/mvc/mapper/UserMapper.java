package com.spring.mvc.mapper;

import com.spring.mvc.been.User;

import java.util.List;

public interface UserMapper {
	
	List<User> getAll();

	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}