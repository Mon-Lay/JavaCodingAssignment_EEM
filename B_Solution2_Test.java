package com.my.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class B_Solution2_Test {

	@Test 
	public void shark(){
		Shark shark = new Shark();
		assertEquals("large", shark.size);
		assertEquals("grey", shark.colour);
		assertEquals("eatOtherFish", shark.performance);
	}
	
	@Test 
	public void clownfish(){
		Clownfish clownfish = new Clownfish();
		assertEquals("small", clownfish.size);
		assertEquals("orange", clownfish.colour);
		assertEquals("makeJokes", clownfish.performance);
	}
	
}
