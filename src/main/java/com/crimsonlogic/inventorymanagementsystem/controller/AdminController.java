package com.crimsonlogic.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.service.IAdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IAdminService iAdminService;
	
	@GetMapping("/viewalladmin")
	public List<Admin> viewAllAdmin() {
		return iAdminService.viewAllAdmin();
	}

	//to insert new admin
	@PostMapping("/insertadmin")
	public Admin insertAdmin(@RequestBody Admin admin) {
		return iAdminService.insertAdmin(admin);
	}
	
}
