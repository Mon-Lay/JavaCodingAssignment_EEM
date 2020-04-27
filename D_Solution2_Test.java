package com.my.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D_Solution2_Test {

	@Test 
	public void caterpillar(){
		Caterpillar caterpillar = new Caterpillar();
		assertEquals(false, caterpillar.fly);
		assertEquals(true, caterpillar.walk);
	}
}
