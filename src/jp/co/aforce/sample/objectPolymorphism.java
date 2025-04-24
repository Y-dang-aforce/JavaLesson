package jp.co.aforce.sample;

public class objectPolymorphism {
	public class Animal {
	    public void makeSound() {
	        System.out.println("Some sound...");
	    }
	}

	public class Dog extends Animal {
	    public void makeSound() {
	        System.out.println("dog sound");
	    }
	}

	public class Cat extends Animal {
	    public void makeSound() {
	        System.out.println("cat sound");
	    }
	}
}
