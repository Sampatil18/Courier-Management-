package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.Customer;
import com.cdac.repository.CustomerRepo;


@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	 	
	public void add(Customer customer) {
		customerRepo.save(customer);
	}
	
	public List<Customer> getAllCustomers() {
		List<Customer> list = customerRepo.findAll(); 
		System.out.println("reached");
		return list;
	}
	
	public Customer findCustomerByEmailAndPassword(String email, String password) {
        return customerRepo.findByEmailAndPassword(email, password);
    }
}
