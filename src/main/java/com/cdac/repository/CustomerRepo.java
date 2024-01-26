package com.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	 Customer findByEmailAndPassword(String email, String password);
}
