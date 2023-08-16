package com.crimsonlogic.inventorymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Integer>{

}
