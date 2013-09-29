package com.app.proj.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.proj.dao.UserDao;
import com.app.proj.entity.User;
import com.app.proj.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserDao userDao;

	@Override
	public void addContact(User user) {}

	@Override
	public void showContact(User user) {}

	@Override
	public void showContact(Integer id) {}

	@Transactional
	public List<User> listContact() {
		return userDao.listContact();
	}

	@Override
	public void removeContact(Integer id) {}

}