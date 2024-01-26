package com.cdac.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.Admin;
import com.cdac.entity.Courier;
import com.cdac.service.CourierService;

@RestController
@CrossOrigin
public class CourierController {

	@Autowired
	private CourierService courierService;
	
	@PostMapping("/add-courier")
	public String add(@RequestBody Courier courier) {
		courierService.add(courier);
		return "Courier details added successfully!";
	}
	
	@GetMapping("/shipments")
	public List<Courier> getAllCourier() {
		return courierService.getAllCourier();
	}
	
	@PostMapping("/getCourier")
	public Courier findByPk(@RequestBody Courier courier) {
		return courierService.findByPk(courier.getCourier_id());
	}
	
	@DeleteMapping("/deleteCourier")
	public void deleteCourierByPk(@RequestBody Courier courier) {
		courierService.deleteByPk(courier.getCourier_id());
	}

}
