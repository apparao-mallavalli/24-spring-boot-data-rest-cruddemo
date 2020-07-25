package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;




@Entity
@Table(name="catalogue")
@Data


public class Catalogue {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;
	 
	    @ManyToOne
	    @JoinColumn(name = "supplier_id", nullable = false)
	    private Supplier supplier;
	    
	    @Column(name = "sku_name")
	    private String sku_name;
	    
	    @Column(name = "sku_description")
	    private String sku_description;
	    
	    @Column(name = "brand_name")
	    private String brand_name;
	    
	    @Column(name = "brand_description")
	    private String brand_description;


}
