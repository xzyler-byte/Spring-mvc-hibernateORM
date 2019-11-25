package com.xzyler.spring.springmvcorm.user.dao;

import java.util.List;

import com.xzyler.spring.springmvcorm.user.entity.User;

public interface UserDao {

	int create(User user);
	
	List<User> findUsers();
	
	User findUser(Integer id);
}
