package com.niit.Computers.Dao;

import java.util.List;

import com.niit.Computers.model.UserDetails;



public interface UserDetailsDao {

	public List<UserDetails> getallUser();
	public boolean addUser(UserDetails userdetail);
	public boolean updateUser(UserDetails userdetail);
	public boolean deleteUser(int id);
}
