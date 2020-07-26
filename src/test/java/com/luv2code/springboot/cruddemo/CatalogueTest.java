
package com.luv2code.springboot.cruddemo;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.luv2code.springboot.cruddemo.entity.Catalogue;
import com.luv2code.springboot.cruddemo.entity.Supplier;
import com.luv2code.springboot.cruddemo.dao.CatalogueRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CatalogueTest {
	CatalogueRepository catalogRepository;
	List<Catalogue> catalog;
	@Test
	public void testCatalogueEntity() {
		Catalogue catalogue = new Catalogue((long) 1,"abc","abc","abc","abc",new Supplier((long) 1, "abc", catalog));
		catalogRepository.save(catalogue);
		
		try {
        	catalogue = new Catalogue((long)0,null,null,null,null,new Supplier((long) 1, "abc", catalog));
        }catch (Exception e) {
        	e.printStackTrace();
        }
	}
}
