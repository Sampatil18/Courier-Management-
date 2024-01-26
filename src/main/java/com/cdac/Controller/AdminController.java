package com.cdac.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.Admin;
import com.cdac.service.AdminService;

@RestController
@CrossOrigin
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/add-admin")
	public String add(@RequestBody Admin  admin) {
		adminService.add(admin);
		return "Admin details added successfully!";
	}
	@GetMapping("/allAdmins")
	public List<Admin> getAllAdmin() {
		return adminService.getAllAdmin();
	}
	
	@PostMapping("/adminlogin")
    public Admin login(@RequestBody Admin admin) {
        return adminService.findCustomerByEmailAndPassword(admin.getEmail(), admin.getPassword());
    }
	
	@PutMapping("/update-admin/{admin_id}")
	public String updateAdmin(@PathVariable int admin_id, @RequestBody Admin updatedAdmin) {
		adminService.updateAdmin(admin_id, updatedAdmin);
	        return "Admin details updated successfully!";
	    }
}
