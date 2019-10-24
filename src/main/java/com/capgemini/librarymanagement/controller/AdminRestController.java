package com.capgemini.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.capgemini.librarymanagement.beans.User;
import com.capgemini.librarymanagement.service.AdminService;
import com.capgemini.librarymanagement.service.AdminServiceImpl;
import com.capgemini.librarymanagement.utility.UserResponse;

import antlr.collections.List;

public class AdminRestController {
	
	/*
	 * @PostMapping("/AdminLogin") public UserResponse login(Integer id, String
	 * password) { UserResponse response=new UserResponse(); Users
	 * admin=service.adminLogin(id, password); if(admin!=null) {
	 * response.setStatusCode(201); response.setMessage("success");
	 * 
	 * }else { response.setStatusCode(404); response.setMessage("failed");
	 * 
	 * } return response; }
	 */

	
	
}
