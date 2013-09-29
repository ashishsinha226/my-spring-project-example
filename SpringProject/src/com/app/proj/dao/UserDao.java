package com.app.proj.dao;

import java.util.List;

import com.app.proj.entity.User;

public interface UserDao {

	public void addContact(User user);
	public void showContact(User user);
	public void showContact(Integer id);
	public List<User> listContact();
	public void removeContact(Integer id);
}