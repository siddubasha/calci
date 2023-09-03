package com.siddu.caliculator.addition;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestAdd {

	
	@Test
	public void testAddition() {
		Add a= new Add();
		
		int actual=a.addition(2,1);
		int expected=3;
		assertEquals(expected, actual);
		
	}
}
