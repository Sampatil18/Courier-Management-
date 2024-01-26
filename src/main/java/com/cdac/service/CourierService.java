package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.Courier;
import com.cdac.repository.CourierRepo;

@Service
public class CourierService {

	@Autowired
	private CourierRepo courierRepo;
	
	public void add(Courier courier) {
		courierRepo.save(courier);
	}
	
	public List<Courier> getAllCourier() {
		return courierRepo.findAll();
	}
	
	public Courier findByPk(int id ) {
		return courierRepo.findById(id).orElse(null);
	}
	
	public void deleteByPk(int id) {
		courierRepo.deleteById(id);
	}  
	
//	@PatchMapping("/{id}")
//    public Courier updateCourier(@RequestBody Courier courier) {
//		
//        Optional<Courier> optionalUser = courierRepo.findById(courier.getCourier_id());
//      
//        if (optionalUser.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//
//        Courier updatedCourier = courierRepo.findById(null);
//        		
//        User user = optionalUser.get();
//        updatedCourier.setStatus(null)              
//        user.setName(updatedUser.getName());
//        user.setEmail(updatedUser.getEmail());
//
//        courierRepo.save(courier);
//
//        return ResponseEntity.ok(user);
//    }	
}
