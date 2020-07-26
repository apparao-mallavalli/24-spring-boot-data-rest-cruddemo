package com.luv2code.springboot.cruddemo;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.luv2code.springboot.cruddemo.entity.Catalogue;
import com.luv2code.springboot.cruddemo.entity.Supplier;
import com.luv2code.springboot.cruddemo.dao.SupplierRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class SupplierTest {
	SupplierRepository supplierRepository;
	List<Catalogue> catalog;
	@Test
	public void testCatalogueEntity() {
		Supplier supplier = new Supplier((long)1,"abc",catalog);
		supplierRepository.save(supplier);
		
		try {
			supplier = new Supplier((long)0,null,catalog);
        }catch (Exception e) {
        	e.printStackTrace();
        }
	}
}
