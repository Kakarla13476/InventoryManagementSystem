package com.crimsonlogic.inventorymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.repository.IAdminRepository;

@Service
public class AdminServiceImpl implements IAdminService{

	@Autowired
	private IAdminRepository iadminRepo;

	@Override
	public List<Admin> viewAllAdmin() {
		return iadminRepo.findAll();
	}

	@Override
	public Admin insertAdmin(Admin admin) {
		return iadminRepo.save(admin);
	}
	
	
}
