package com.my.assignment;

public class A_Solution1 {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}

class Animal {
	void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal{
	
	void fly() {
		System.out.println("I am flying");
	}
	
	/* Implement for sing() method */
	public String sing(){
		return "I am singing";
	}
}

