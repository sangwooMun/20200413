package co.ded.array;

import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] names = new String[3]; // 이름
		int[] scores = new int[3]; // 점수
		
		for(int i=0; i<names.length; i++) {
			System.out.println("학생의 이름 >");
			names[i] = scanner.next();
			
			System.out.println("학생의 점수 >");
			scores[i] = scanner.nextInt();
			
		}
		System.out.println("조회할 학생이름 입력 >");
		String searchName = scanner.next();
		
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(searchName)) {
				System.out.println(searchName + "는 " + scores[i] + "점 입니다.");
			}
		}
		scanner.close();
		System.out.println("end of prog.");
		
	}

}
