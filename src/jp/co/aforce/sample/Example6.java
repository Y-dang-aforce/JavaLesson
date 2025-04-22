package jp.co.aforce.sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Example6 {
	public static void main(String[] args) {
		 String name="エイフォース 党姸";
		 int age=25;
		 LocalDate birthDate = LocalDate.of(1999, 10, 29);
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 String formattedInfo = String.format(
		            "氏名: %s, 年齢: %d歳, 誕生日: %s",
		            name, age, birthDate.format(formatter)
		        );
		 System.out.println(formattedInfo);
}
}
