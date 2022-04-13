package co.ded.dimension;

import java.util.Scanner;

public class StudentExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("학생이름 점수 나이"); // 홍길동 80 20
		s1.studentName = scanner.next();
		s1.score = Integer.parseInt(scanner.next()); // 1 != "1"
		s1.age = Integer.parseInt(scanner.next());
		
		Student[] students = {new Student(), new Student(), new Student()};
		// 반복문 쓰기
		students[0].studentName = scanner.next();
		students[0].score = Integer.parseInt(scanner.next());
		students[0].age = Integer.parseInt(scanner.next());
		
		scanner.close();
		// 조회하고 싶은 이름입력..
		// 해당이름 홍길동은 나이는 20살이고 점수는 80점입니다.
		
		
	}

}
