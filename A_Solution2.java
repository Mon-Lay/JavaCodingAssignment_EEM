package com.my.assignment;

public class A_Solution2 {
	
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.say();
		Chicken chicken = new Chicken();
		chicken.say();		
	}
}	

class Duck extends Bird {
	boolean swim = true;
	
	public String say(){	
		return "Quack, quack";
	}
}

class Chicken extends Bird {
	boolean fly = false;
	
	public String say(){
		return "Cluck, cluck";
	}
}


