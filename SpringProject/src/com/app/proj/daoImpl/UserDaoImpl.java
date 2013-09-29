package com.app.proj.daoImpl;

import java.util.List;

import com.app.proj.dao.UserDao;
import com.app.proj.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addContact(User user) {
	}

	@Override
	public void showContact(User user) {
	}

	@Override
	public void showContact(Integer id) {
	}

	@Override
	public List<User> listContact() {
		return sessionFactory.getCurrentSession().createQuery("from user")
				.list();
	}

	@Override
	public void removeContact(Integer id) {
	}
}