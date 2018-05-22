package com.niit.Computers.testcase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Computers.Dao.ProductDao;
import com.niit.Computers.model.Product;



public class ProductTestCase {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.Computers.config");
		
		context.refresh();
		
		ProductDao productdao=(ProductDao)context.getBean("ProductDao");
		Product p=new Product();
		
		p.setProductid(101);
		p.setPrize(45000);
		p.setProductname("Lenovo");
		
		productdao.addProduct(p);
		
		System.out.println("Product successfully register");

	}

}
