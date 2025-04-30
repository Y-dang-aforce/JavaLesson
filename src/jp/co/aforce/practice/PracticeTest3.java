package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;
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

		List<Integer> numList1= new ArrayList<Integer>();
		numList1.add(10);
		numList1.add(15);
		numList1.add(16);
		numList1.add(19);
		List<Integer> numList2= new ArrayList<Integer>();
		numList2.add(11);
		numList2.add(12);
		numList2.add(18);
		numList2.add(20);
		
		numList1.addAll(numList2);
		
		Collections.sort(numList1);
		
		for (Integer num : numList1) {
			System.out.println(num);
		}
		List<Integer> numList3= new ArrayList<Integer>();	
		numList3.add(13);
		numList3.add(14);
		numList3.add(17);
		numList3.add(21);
		
		Collections.sort(numList1);
		Collections.sort(numList3);
		
		int g=0;
		int j=0;
		
		while(g<numList1.size()&&j<numList3.size()) {
			if(numList1.get(g)<numList3.get(j)) {
				System.out.println(numList1.get(g));
				g++;
			}else {
				System.out.println(numList3.get(j));
				j++;
			}
		}
		while(g<numList1.size()) {
			System.out.println(numList1.get(g));
			g++;
		}
		while(j<numList3.size()) {
			System.out.println(numList3.get(j));
			j++;
		}
	}
}
