package com.my.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A_Solution3_Test {

	@Test 
	public void say(){
		Rooster rooster = new Rooster();
		String expected = "Cock-a-doodle-doo";
		assertEquals(expected, rooster.say());
	}
}
