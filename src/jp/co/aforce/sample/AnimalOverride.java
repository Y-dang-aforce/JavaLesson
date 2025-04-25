package jp.co.aforce.sample;

class Animal {
	void makeSound() {
		System.out.println("動物の声がします。");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("ワンワン");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("にゃんにゃん");
	}
}

public class AnimalOverride {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();

		dog.makeSound();
		cat.makeSound();
	}

}
