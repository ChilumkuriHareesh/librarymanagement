package com.capgemini.librarymanagement.dao;

import java.util.List;

import com.capgemini.librarymanagement.beans.User;

public interface AdminDao {

	public User adminLogin(String adminId,String password);

	public Boolean registerLibrarian(User librarian);

	public Boolean registerUser(User user);

	public Boolean deleteUser(String userId);

	public User searchUser(String userId);

	public User searchLibrarian(String LibrarianId);

	public Boolean deleteLibrarian(String LibrarianId);

	public List<User> getAllLibrarian();

	public List<User> getAllUser();

}
