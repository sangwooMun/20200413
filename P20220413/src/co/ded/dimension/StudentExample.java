package co.ded.dimension;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		// 학생이름, 점수 > names, scores
		Student s1 = new Student(); // 학생이름, 점수 를 저장할수있는 하나의 공간 (객체)
		s1.studentName = "홍길동";
		s1.score = 80;
		s1.age = 26;
		
		Student s2 = new Student(); 
		s2.studentName = "김길동";
		s2.score = 75;
		s2.age = 25;
		
		Student s3 = new Student(); 
		s3.studentName = "문길동";
		s3.score = 82;
		s3.age = 24;
		
		Student[] students = {s1, s2, s3};
		
		int searchAge = 24;
		for(int i=0; i<students.length; i++) {
			if(students[i].age > 24) {
				System.out.println(students[i].studentName + students[i].age);
			}
		} 
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("학생이름 입력 >");
//		String searchName = scanner.next();
//		
//		for(int i=0; i<students.length; i++) {
//			if(students[i].studentName.equals(searchName)) {
//				System.out.println(students[i].score);
//			}
//		}
		System.out.println("end of prog");
//		scanner.close();
				
				
	}

}
