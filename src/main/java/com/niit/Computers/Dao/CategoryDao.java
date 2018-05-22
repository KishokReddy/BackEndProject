package com.niit.Computers.Dao;

import java.util.List;

import com.niit.Computers.model.Category;




public interface CategoryDao {
	
	public List<Category> getallCategory();
	public boolean addCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(int categoryid);
}
