package jp.co.aforce.sample;

public class Car {
	String model;
	Integer speed;

	void display() {
		System.out.println("車種は：" + model + "速度は：" + speed);
	}

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();

		car1.model = "車種１";
		car1.speed = 100;

		car2.model = "車種２";
		car2.speed = 150;

		car1.display();
		car2.display();
	}
}
