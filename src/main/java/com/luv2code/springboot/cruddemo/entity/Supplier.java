package com.luv2code.springboot.cruddemo.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="supplier")
@Data


public class Supplier {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
	
	 @Column(name = "supplier_name")
	   private String supplier_name;
     
	 @OneToMany(cascade = CascadeType.ALL, mappedBy = "supplier")
	 private List<Catalogue> catalogues;

}
