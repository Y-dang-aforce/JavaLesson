package jp.co.aforce.practice;

import java.util.ArrayList;

public class praticeTest5 {
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt();
		Integer fortune = r;
		String message;
		switch (fortune) {
		case 1:
			message = "吉";
			break;
		case 2:
			message = "中吉";
			break;
		case 3:
			message = "大吉";
			break;
		default:
			message = "凶";
		}
		System.out.println("現在の数字は：" + r + "-" + message);

		int a = 0;
		while (a <= 14) {
			for (int x = 1; x <= 100; x++) {
				if (a == x / 7) {
					System.out.println(x);
					x++;
					a++;
				}
			}
		}
		
		for (int y = 1; y <= 9; y++) {
			for (int z = 1; z <= 9; z++) {
				System.out.print(y * z+" ");
			}
			System.out.println("\n");
		}
		
		for(int c=10;c<=19;c++) {
			for(int d=10;d<=19;d++) {
				System.out.print(c*d+" ");
			}
			System.out.println("\n");
		}
		
		ArrayList<String>employees=new ArrayList<>();
		employees.add("斎藤");
		employees.add("田中");
		employees.add("山田");
		employees.add("鈴木");
		employees.add("高橋");
		
		ArrayList<String>submitters=new ArrayList<>();
		submitters.add("斎藤");
		submitters.add("高橋");
		
		employees.addAll(submitters);
		for(String employee:employees) {
			if(!submitters.contains(employee)) {
				System.out.println(employee);
			}
		}
		
		for(int e=2;e<=100;e++) {
			boolean isPrime=true;
		
			for(int f=2;f<=e-1;f++) {
				if(e%f==0) {
				isPrime=false;
			}
			}
			if(isPrime) {
				System.out.println(e);
			}
		}		
	}
}


