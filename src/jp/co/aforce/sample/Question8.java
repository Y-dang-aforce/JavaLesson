package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Question8 {
	public static void main(String[] args) {
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("リンゴ");
		fruitList.add("バナナ");
		fruitList.add("さくらんぼ");
		fruitList.remove("バナナ");
		fruitList.add("オレンジ");
		System.out.println(fruitList);
	}
}
