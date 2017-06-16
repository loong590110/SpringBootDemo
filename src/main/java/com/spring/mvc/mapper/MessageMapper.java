package com.spring.mvc.mapper;

import com.spring.mvc.been.Message;

import java.util.List;

public interface MessageMapper {
	
	List<Message> getAll();

	Message getOne(Long id);

	void insert(Message message);

	void update(Message message);

	void delete(Long id);

}