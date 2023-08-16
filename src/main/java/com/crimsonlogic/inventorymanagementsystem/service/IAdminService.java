package com.crimsonlogic.inventorymanagementsystem.service;

import java.util.List;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;

public interface IAdminService {

	public List<Admin> viewAllAdmin();

	public Admin insertAdmin(Admin admin);

}
