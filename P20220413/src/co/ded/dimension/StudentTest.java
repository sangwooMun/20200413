package co.ded.dimension;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student s1 = new Student();
		s1.studentName = "문상우";
		s1.age = 26;
		s1.score = 99;

		Student s2 = new Student();
		s2.studentName = "김상우";
		s2.age = 29;
		s2.score = 50;

		Student s3 = new Student();
		s3.studentName = "박상우";
		s3.age = 23;
		s3.score = 78;

		Student[] students = { s1, s2, s3 };

		System.out.println("조회하고 싶은 이름입력 >");
		String searchName = scanner.next();

		for (int i = 0; i < students.length; i++) {
			if (students[i].studentName.equals(searchName)) {
				System.out.println("해당이름 " + students[i].studentName + 
									"의 나이는 " + students[i].age + "이며, 나이는 " + 
									students[i].score + "살 입니다.");
			}
		}
		scanner.close();
	}

}
