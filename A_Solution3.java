package com.my.assignment;

public class A_Solution3 {

	public static void main(String[] args) {
		Rooster rooster = new Rooster();
		rooster.say();	
	}
}

class Rooster extends Chicken {
	
	public String say(){	
		return "Cock-a-doodle-doo";
	}
}

/* c answer is I think there is a other way that just create class without extend Chicken class */