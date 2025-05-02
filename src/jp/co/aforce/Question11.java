package jp.co.aforce;

import java.util.ArrayList;
import java.util.List;

/*
 * Javadoc用コメントのテストプログラム
 * @author y.dang
 * @version 1.0
 */
public class Question11 {
	private String name;
	private String author;
	private int quanlity;
	private int price;

	/*
	 * コンストラクタ
	 */
	public Question11(String name, String author, int quanlity, int price) {
		this.name = name;
		this.author = author;
		this.quanlity = quanlity;
		this.price = price;
	}

	/*
	 * setterとgetter
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuanlity() {
		return quanlity;
	}

	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/*
	 * mainメソッド
	 * インスタント化
	 */
	public static void main(String[] args) {
		Question11 book1 = new Question11("「Python入門」", "山田太郎", 1500, 2500);
		Question11 book2 = new Question11("「データ分析の基礎」", "鈴木花子", 1200, 3000);
		Question11 book3 = new Question11("「AI技術最前線」", "佐藤一郎", 800, 4000);
		Question11 book4 = new Question11("「Webデザイン講座」", "田中美咲", 2000, 2000);
		Question11 book5 = new Question11("「はじめての機械学習」", "中村健一", 900, 3500);

		List<Question11> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);

		//全書籍の総売上額を計算する機能
		//販売数が1000冊を超える書籍を抽出する機能
		//価格あたりの販売効率が最も高い書籍を特定する機能（販売数 / 価格）
		List<String> overthousansdsList = new ArrayList<>();
		int total = 0;
		double rate = 0;
		String MaxBook = " ";
		double MaxRate = 0.0;
		for (Question11 book : bookList) {
			int subtotal = book.getQuanlity() * book.getPrice();
			total += subtotal;
			if (book.getQuanlity() > 1000) {
				overthousansdsList.add(book.getName());
			}
			rate = (double) book.getQuanlity() / book.getPrice();
			if (rate > MaxRate) {
				MaxBook = book.getName();
			}
		}
		System.out.println("全書籍の総売上額は：" + total + "万冊");
		System.out.println("販売数が1000冊を超える書籍は：" + overthousansdsList);
		System.out.println("価格あたりの販売効率が最も高い書籍は：" + MaxBook);

	}
}
