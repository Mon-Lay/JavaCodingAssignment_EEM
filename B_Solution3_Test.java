package com.my.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class B_Solution3_Test {

	@Test 
	public void dolphin(){
		Dolphin dolphin = new Dolphin();
		assertEquals(true, dolphin.swim);
	}
}
