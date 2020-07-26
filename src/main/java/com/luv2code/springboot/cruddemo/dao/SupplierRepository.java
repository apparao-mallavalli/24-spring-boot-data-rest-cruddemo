package com.luv2code.springboot.cruddemo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.cruddemo.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
	
	public  Optional<Supplier> findById(@RequestParam("id") Long id);
	
	
	
}
