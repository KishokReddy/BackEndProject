package com.niit.Computers.Dao;

import java.util.List;

import com.niit.Computers.model.Product;

public interface ProductDao {
	public List<Product> getallProduct();
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int productid);

}
