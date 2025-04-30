package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class PracticeTest4 {
	public static void main(String[] args) {
		List<String> animalList = new ArrayList<String>();
		animalList.add("犬");
		animalList.add("猫");
		animalList.add("うさぎ");
		animalList.add("へび");

		Scanner sc = new Scanner(System.in);
		System.out.println("動物名を入力してください:");
		String message;
		String animals = sc.nextLine();
		switch(animals) {
		case"犬":
			message="犬はリストに含まれています";
			break;
		case"猫":
			message="猫はリストに含まれています";
			break;
		case"うさぎ":
			message="うさぎはリストに含まれています";
			break;
		case"へび":
			message="へびはリストに含まれています";
			break;
		default:
			message=animals+"はリストに含まれていません";
		}
			System.out.println("現在の動物名は："+animals+":"+message);
			
			sc.close();

		
	
		
		String messages;
		
		Calendar calendar=Calendar.getInstance();
		
		int month=calendar.get(Calendar.MONTH)+1;
		switch (month) {
		case 1:
			messages = "冬物セール";
			break;
		case 2, 3, 4:
			messages = "春物を売る";
			break;
		case 5:
			messages = "春物セール";
			break;
		case 6, 7:
			messages = "夏物を売る";
			break;
		case 8:
			messages = "夏物セール";
			break;
		case 9:
			messages = "秋物を売る";
			break;
		case 10, 11, 12:
			messages = "冬物を売る";
			break;
		default:
			messages = "不正な月です";
		}
		System.out.println("現在の月は：" + month + "-" + messages);
	}
}
