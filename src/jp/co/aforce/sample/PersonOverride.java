package jp.co.aforce.sample;

class Person {
	String name;
	Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return ("名前は：" + name + "年齢は：" + age);
	}
}

public class PersonOverride {
	public static void main(String[] args) {
		Person person1 = new Person("山田花子", 30);
		System.out.println(person1);

	}
}

