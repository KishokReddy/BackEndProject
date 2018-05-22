package com.niit.Computers.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Computers.model.UserDetails;

@Repository("UserDetailsDao")
@Transactional
public class UserDetailsDaoImp implements UserDetailsDao{
	
	@Autowired
	 SessionFactory sessionFactory;

	public List<UserDetails> getallUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addUser(UserDetails userdetail) {
		sessionFactory.getCurrentSession().save(userdetail);
		return true;
	}

	public boolean updateUser(UserDetails userdetail) {
		sessionFactory.getCurrentSession().update(userdetail);
		return true;
	}

	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
