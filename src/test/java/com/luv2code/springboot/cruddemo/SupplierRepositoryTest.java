package com.luv2code.springboot.cruddemo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.luv2code.springboot.cruddemo.dao.SupplierRepository;
import com.luv2code.springboot.cruddemo.entity.Catalogue;
import com.luv2code.springboot.cruddemo.entity.Supplier;

@RunWith(SpringRunner.class)
@DataJpaTest
public class SupplierRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private SupplierRepository supplierrepository;

    @Test
    public void testFindBySupplier_id() {
    
        
        //assertThat(catalog).extracting(Catalogue::getSupplier).containsOnly((long)1,"John",catalogue);
    }
}