package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.wipro.Calculator;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator cal=new Calculator();
		int actual=cal.add(15, 10);
		assertEquals(25, actual);
		
	}

	@Test
	@Disabled
	void testSub() {
		Calculator t=new Calculator();
	
		
		
	}

}
