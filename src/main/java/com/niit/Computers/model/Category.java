package com.niit.Computers.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	private int categoryid;
	private String CatType;
	
	
	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getCatType() {
		return CatType;
	}

	public void setCatType(String catType) {
		CatType = catType;
	}

	
	
	
	

}
