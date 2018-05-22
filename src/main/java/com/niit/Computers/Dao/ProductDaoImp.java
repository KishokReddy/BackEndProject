package com.niit.Computers.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Computers.model.Product;

@Repository("ProductDao")
@Transactional
public class ProductDaoImp implements ProductDao{

	@Autowired
	 SessionFactory sessionFactory;

	public List<Product> getallProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addProduct(Product product) {
			sessionFactory.getCurrentSession().save(product);
			return true;
	}

	public boolean updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
		return true;
	}

	public boolean deleteProduct(int productid) {
		// TODO Auto-generated method stub
		return false;
	}
	



	

}
