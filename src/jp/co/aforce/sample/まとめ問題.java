package jp.co.aforce.sample;

import java.util.Scanner;

public class まとめ問題 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("商品名を入力してください：");
		String value;
		String goods=sc.nextLine();
		switch(goods) {
		case"りんご":
			value="100円";
			break;
		case"みかん":
			value="80円";
			break;
		case"バナナ":
			value="120円";
			break;
		case"いちご":
			value="300円";
			break;
		default:
			value="申し訳ございませんが、その商品は取り扱っておりません。";
		}
		System.out.println(goods+":"+value);
		sc.close();	
		
	}

}
