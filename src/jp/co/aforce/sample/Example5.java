package jp.co.aforce.sample;

import java.util.Scanner;

public class Example5 {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("名前を入力してください：");
        String name = sc.nextLine();
        System.out.println("こんにちは," + name + "さん！");
        sc.close();
    }
}
