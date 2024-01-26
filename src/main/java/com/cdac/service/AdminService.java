package com.cdac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.Admin;
import com.cdac.repository.AdminRepo;

@Service
public class AdminService {

	@Autowired
	private AdminRepo adminRepo;
	
	public void add(Admin admin) {
		adminRepo.save(admin);
	}
	
	public List<Admin> getAllAdmin() {
		return adminRepo.findAll();
	}
	
	public Admin findCustomerByEmailAndPassword(String email, String password) {
        return adminRepo.findByEmailAndPassword(email, password);
    }
	
	 public void updateAdmin( int admin_id, Admin updatedAdmin) {
	        // Implement logic to update admin
	        Optional<Admin> existingAdminOptional = adminRepo.findById(admin_id);

	        if (existingAdminOptional.isPresent()) {
	            Admin existingAdmin = existingAdminOptional.get();
	            // Update the fields you want to update
	            existingAdmin.setName(updatedAdmin.getName());
	            existingAdmin.setEmail(updatedAdmin.getEmail());
	            existingAdmin.setPassword(updatedAdmin.getPassword());

	            // Save the updated admin
	            adminRepo.save(existingAdmin);
	        } else {
	            // Handle the case where admin with the given ID is not found
	            // You can throw an exception or handle it as needed
	        }
	    }
	
}
