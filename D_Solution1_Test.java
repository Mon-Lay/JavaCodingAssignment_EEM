package com.my.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D_Solution1_Test {

	@Test 
	public void butterfly(){
		Butterfly butterfly = new Butterfly();
		assertEquals(true, butterfly.fly);
		assertEquals(false, butterfly.sound);
	}
}
