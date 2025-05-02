package jp.co.aforce.sample;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("年齢を入力してください:");
		String input = sc.nextLine();
		Integer age = Integer.parseInt(input);
		int price = 0;
		if (age < 3 && age > 0) {
			price = 0;
		}
		if (age >= 4 && age <= 12) {
			price = 500;
		}
		if (age >= 13 && age <= 17) {
			price = 800;
		}
		if (age >= 18 && age <= 59) {
			price = 1200;
		}
		if (age > 60 && age < 100) {
			price = 700;
		} else {
			System.out.println("不正な値です。");
		}
		System.out.println("入場料は" + price + "円です");
		sc.close();

	}
}
