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
	
	
	    public Catalogue(Long id,  String sku_name, String sku_description, String brand_name,
			String brand_description,Supplier supplier) {
		super();
		this.id = id;
		this.supplier = supplier;
		this.sku_name = sku_name;
		this.sku_description = sku_description;
		this.brand_name = brand_name;
		this.brand_description = brand_description;
	}

	    
	    public Catalogue() {
	    	
	    }
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;
	 
	   
	    
	    @Column(name = "sku_name")
	    private String sku_name;
	    
	    @Column(name = "sku_description")
	    private String sku_description;
	    
	    @Column(name = "brand_name")
	    private String brand_name;
	    
	    @Column(name = "brand_description")
	    private String brand_description;
	    
	    @ManyToOne
	    @JoinColumn(name = "supplier_id", nullable = false)
	    private Supplier supplier;


}
