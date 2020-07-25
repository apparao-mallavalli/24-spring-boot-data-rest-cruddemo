package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.cruddemo.entity.Catalogue;




public interface CatalogueRepository extends JpaRepository<Catalogue, Long> {
	
	  List<Catalogue> findBySupplier_id(@RequestParam("supplier_id") Long id);


}
