package com.my.assignment;

import static org.junit.Assert.*;
import org.junit.Test;

public class A_Solution1_Test {
	
	@Test 
	public void sing(){
		Bird bird = new Bird();
		String expected = "I am singing";
		assertEquals(expected, bird.sing());
	}
}
