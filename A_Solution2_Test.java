package com.my.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A_Solution2_Test {

	@Test 
	public void sayDuck(){
		Duck duck = new Duck();
		String expected = "Quack, quack";
		assertEquals(expected, duck.say());
		assertEquals(true, duck.swim);
	}
	
	@Test 
	public void sayChicken(){
		Chicken chicken = new Chicken();
		String expected = "Cluck, cluck";
		assertEquals(expected, chicken.say());
		assertEquals(true, chicken.fly);
	}
}
