package jp.co.aforce.sample;

public class Rectangle {
	Integer width;
	Integer height;
	
	void display(){
		Integer area=width*height;
		System.out.println("この正方形の面積は："+area);
		
	}
	public static void main(String[] args) {
		Rectangle rectangle1=new Rectangle();
		
		rectangle1.width=4;
		rectangle1.height=2;
		
		rectangle1.display();
	}
}
