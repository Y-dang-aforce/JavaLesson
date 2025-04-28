package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		int x = 480;
		final double TAX = 0.10;
		System.out.println("消費税率は" + TAX);
		double price = x + x * TAX;
		System.out.println("税込金額は" + price);
		String name = "党姸";
		System.out.println("名前は" + name);
		String moji1 = "この商品の値段は";
		String moji2 = "円です";
		System.out.println(moji1 + price + moji2);

	}
}
