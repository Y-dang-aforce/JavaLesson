package jp.co.aforce.sample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Exampl11 {
	 public static void main(String args[])throws Exception { 
		 Date today = new Date();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		  String birthDateString = "1999-10-29";
		  Date birthday = sdf.parse(birthDateString);
		  long diffInMillies = Math.abs(birthday.getTime() - today.getTime());
		  long daysUntilBirthday = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		  System.out.println("Days until birthday: " + daysUntilBirthday);
	 }
	 }

