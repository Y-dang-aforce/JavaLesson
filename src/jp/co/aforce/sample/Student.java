package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Student {
		String name;
		Integer score;
		
		
		public void setStudent(String name,Integer score) {
			this.name = name;
			this.score = score;
		}
		public void showStudent() {
			System.out.println("名前は："+name+"成績は："+score+"点");
		}
		
		
		public static void main(String[] args) {
			List<Student>StudentList=new ArrayList<>();
			Student s1=new Student();
			Student s2=new Student();
			Student s3=new Student();
			
			s1.setStudent("山田太郎",70);
			s2.setStudent("山田花子", 75);
			s3.setStudent("佐藤二郎",80);
			
			StudentList.add(s1);
			StudentList.add(s2);
			StudentList.add(s3);
			
			showAverage(StudentList);
		}		
		public static void showAverage(List<Student>StudentList) {
			int sum=0;
			for(Student s:StudentList) {
				sum+=s.score;
			}
			double Average = sum/(double)StudentList.size();
			System.out.println("成績の平均点は："+Average+"点");
			
		}	
		
}

