package com.my.assignment;

public class A_Solution4 {
	
	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.say("dog");	
		parrot.say("cat");		
		parrot.say("rooster");		
		parrot.say("duck");				
	}
}	

class Parrot extends Bird {
	
	public String say(String livingAnimal){
		String result = "";
		Dog dog = new Dog();
		Cat cat = new Cat();
		Rooster rooster = new Rooster();
		Duck duck = new Duck();
		try{
			if(livingAnimal.equals("dog"))
				result = dog.say();
			else if(livingAnimal.equals("cat"))
				result = cat.say();
			else if(livingAnimal.equals("rooster"))
				result = rooster.say();
			else if(livingAnimal.equals("duck"))
				result = duck.say();
		}catch (Exception e) {
			e.printStackTrace();
		}	
		return result;
	}
}

class Dog {	
	public String say(){
		return "Woof, woof";
	}
}

class Cat {	
	public String say(){	
		return "Meow";
	}
}

/* d answer is that it is near a phone that rings frequently */
