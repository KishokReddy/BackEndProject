package com.niit.Computers.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.Computers.model.Category;

@Repository("CategoryDao")
@Transactional
public class CategoryDaoImp implements CategoryDao {

	@Autowired
	 SessionFactory sessionFactory;
	
	public List<Category> getallCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addCategory(Category category) {
		sessionFactory.getCurrentSession().save(category);
		return true;
	}

	public boolean updateCategory(Category category) {
		sessionFactory.getCurrentSession().update(category);
		return true;
	}

	public boolean deleteCategory(int categoryid) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

}
