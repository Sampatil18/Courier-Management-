package com.cdac;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cdac.entity.Admin;
import com.cdac.repository.AdminRepo;

@SpringBootTest
class CourierManagementSystemApplicationTests {

	@Autowired
	private AdminRepo adminRepo;
	
	@Test
	void addAdmin() {
		Admin admin = new Admin();
		admin.setName("shubham");
		admin.setEmail("shubham@yahoo.com");
		admin.setPassword("shubham");
		
		adminRepo.save(admin);
	}
}
