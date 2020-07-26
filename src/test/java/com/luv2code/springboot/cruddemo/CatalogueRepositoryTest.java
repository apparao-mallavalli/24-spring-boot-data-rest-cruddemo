package com.luv2code.springboot.cruddemo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.luv2code.springboot.cruddemo.dao.CatalogueRepository;
import com.luv2code.springboot.cruddemo.entity.Catalogue;
import com.luv2code.springboot.cruddemo.entity.Supplier;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CatalogueRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CatalogueRepository cataloguerepository;

    @Test
    public void testFindBySupplier_id() {
    	List<Catalogue> catalogue = null;
        entityManager.persist(new Catalogue((long)1,"abc","def","ghi","jkl",new Supplier((long)1,"John",catalogue)));
        List<Catalogue> catalog = cataloguerepository.findBySupplier_id((long)1);
        assertEquals(1, catalog.get(0));
        entityManager.persist(new Catalogue((long)2,"abc","def","ghi","jkl",new Supplier((long)3,"John",catalogue)));
        List<Catalogue> catalog1 = cataloguerepository.findBySupplier_id((long)1);
        assertEquals(1, catalog1.get(0));
        try {
        	entityManager.persist(new Catalogue((long)0,null,null,null,null,new Supplier((long)3,"John",catalogue)));
        }catch (Exception e) {
        	e.printStackTrace();
        }
        
        //assertThat(catalog).extracting(Catalogue::getSupplier).containsOnly((long)1,"John",catalogue);
    }
}