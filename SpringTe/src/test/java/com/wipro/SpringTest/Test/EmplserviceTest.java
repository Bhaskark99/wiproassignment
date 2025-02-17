package com.wipro.SpringTest.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.SpringTest.entity.Empolyee;
import com.wipro.SpringTest.service.Iemplserv;
@SpringBootTest
class EmplserviceTest {
	@Autowired
	Iemplserv es;
	
	@Test
	void testAdd() {
		Empolyee emp=new Empolyee(1, "bhaskar", 450000);
		Empolyee e=es.add(emp);
		if(e==null)
		{
			
			System.out.println("not insert data");
		}
		else
		{
			System.out.println(e);
		}
	}
   
	@Test
	void testGetById() {
		if(es.getById(1)==null)
		{
			System.out.println("no data availale in database");
		}
		else
		{
			System.out.println(es.getById(1));
		}
	}

}
