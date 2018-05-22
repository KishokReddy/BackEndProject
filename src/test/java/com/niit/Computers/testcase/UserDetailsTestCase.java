package com.niit.Computers.testcase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Computers.Dao.UserDetailsDao;
import com.niit.Computers.model.UserDetails;

public class UserDetailsTestCase {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.Computers.config");
		
		context.refresh();
		
		UserDetailsDao userdetaildao=(UserDetailsDao)context.getBean("UserDetailsDao");
		UserDetails ud=new UserDetails();
		
		ud.setId(101);
		ud.setName("kishok");
		ud.setAddress("chennai");
		ud.setPhoneno(25641556);
		
		userdetaildao.addUser(ud);
		ud.setId(102);
		ud.setName("Abinove");
		ud.setAddress("coimbatore");
		ud.setPhoneno(5541602);
		
		userdetaildao.addUser(ud);
		ud.setId(103);
		ud.setName("sunil");
		ud.setAddress("trichy");
		ud.setPhoneno(16521656);
		
		userdetaildao.addUser(ud);
		
		System.out.println("userdetails successfully register");
		
		
	}

}
