package jp.co.aforce.sample;

public class Dog1 {
	String name;
	
	public void setInfo(String name) {
		this.name=name;
	}
	public void displayInfo() {
		System.out.println("犬の名前は："+name+"です。");
	}
	
	public static void main(String[] args) {
		Dog1 dog1 = new Dog1();
		
		dog1.setInfo("ポチ");
		dog1.displayInfo();
		
	}
}
