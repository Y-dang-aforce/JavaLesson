package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest3 {
	static String[] goods = { "シャープペンシル", "ポールペン", "リングノート", "クリップ", "消しゴム" };

	public static void main(String[] args) {
		System.out.println(goods[2]);

		List<String> employeeList = new ArrayList<String>();
		employeeList.add("山田太郎");
		employeeList.add("鈴木花子");
		employeeList.add("佐藤二郎");
		employeeList.add("山田太郎");
		employeeList.add("高橋三郎");
		System.out.println(employeeList);
		String element1 = employeeList.get(2);
		System.out.println(element1);

		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(11);
		numList.add(12);
		numList.add(15);
		numList.add(16);
		numList.add(18);
		numList.add(19);
		numList.add(20);
		for (Integer num : numList) {
			System.out.println(num);
			
			numList.add(3, 13);
			numList.add(4, 14);
			numList.add(7, 17);
			numList.add(11, 21);
			for (Integer Num : numList) {
				System.out.println(Num);
			}
		}
	}
}
