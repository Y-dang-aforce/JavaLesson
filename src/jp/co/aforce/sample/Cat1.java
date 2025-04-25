package jp.co.aforce.sample;

public class Cat1 {
	String name;

	void meow() {
		System.out.println(name + "が鳴いた！");
	}

	public static void main(String[] args) {
		Cat1 cat1 = new Cat1();

		cat1.name = "ネコ";

		cat1.meow();
	}
}
