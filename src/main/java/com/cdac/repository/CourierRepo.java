package com.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.entity.Courier;

public interface CourierRepo extends JpaRepository<Courier, Integer> {

}
