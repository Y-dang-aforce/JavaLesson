package jp.co.aforce.sample;

import java.util.Scanner;

public class Question９ {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("商品の単価を入力してください:");
		String input = sc.nextLine();
		Integer price = Integer.parseInt(input);

		Scanner sc1 = new Scanner(System.in);
		System.out.println("購入個数を入力してください: ");
		String input1 = sc1.nextLine();
		Integer quanlity = Integer.parseInt(input1);

		int total = price * quanlity;

		int total1 = 0;
		int gap = 0;
		final double Tax = 0.10;
		int totalTax = 0;
		int TaxContains = 0;
		if (quanlity > 3 && quanlity < 5) {
			price -= 50;
		}
		if (quanlity > 5) {
			price -= 100;
		}
		if (total > 5000 && total < 10000) {
			total1 = (int) (total * 0.95);
		}
		if (total > 10000) {
			total1 = (int) (total * 0.9);
		}
		gap = total - total1;

		totalTax = (int) (total1 * Tax);

		TaxContains = (int) (total1 + totalTax);

		System.out.println("商品の単価:" + price);
		System.out.println("購入個数:" + quanlity);
		System.out.println("割引前の合計金額:" + total);
		System.out.println("割引額:" + gap);
		System.out.println("割引後の価格:" + total1);
		System.out.println("消費税額:" + totalTax);
		System.out.println("税込価格:" + TaxContains);
		sc.close();
		sc1.close();

	}
}
