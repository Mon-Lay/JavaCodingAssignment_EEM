package com.my.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class B_Solution1_Test {

	@Test 
	public void fish(){
		Fish fish = new Fish();
		assertEquals(false, fish.sing);
		assertEquals(false, fish.walk);
		assertEquals(true, fish.swim);
	}
}
