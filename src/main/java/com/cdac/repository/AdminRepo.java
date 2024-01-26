package com.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.entity.Admin;
import com.cdac.entity.Customer;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
	Admin findByEmailAndPassword(String email, String password);
}
