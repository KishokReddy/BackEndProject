package com.niit.Computers.testcase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Computers.Dao.CategoryDao;
import com.niit.Computers.model.Category;


public class CategoryTestCase {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.Computers.config");
		
		context.refresh();
		
		CategoryDao categorydao=(CategoryDao)context.getBean("CategoryDao");
		Category c=new Category();
		
		c.setCategoryid(101);
		c.setCatType("laptop");
		
		categorydao.addCategory(c);
		
		System.out.println("Category successfully register");


	}

}
