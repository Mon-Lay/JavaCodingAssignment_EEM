package com.my.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A_Solution4_Test {

	@Test 
	public void say(){
		Parrot parrot = new Parrot();
		assertEquals("Woof, woof", parrot.say("dog"));
		assertEquals("Meow", parrot.say("cat"));
		assertEquals("Cock-a-doodle-doo", parrot.say("rooster"));
		assertEquals("Quack, quack", parrot.say("duck"));
	}
}
