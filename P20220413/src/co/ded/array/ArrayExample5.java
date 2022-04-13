package co.ded.array;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] scores = new int[5];

		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생점수를 입력 : ");
			scores[i] = scanner.nextInt();
		}

		int max, min;
		max = min = scores[0];

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			if (max < scores[i]) {
				max = scores[i];
			}

			if (min >= scores[i]) {
				min = scores[i];
			}
		}
		// 학생중에 최고점, 최저점.
		System.out.println("최저점 : " + min);
		System.out.println("최고점 : " + max);
		
		// 학생이름, 점수
		// 배열, 배열 0 > 학생, 90
		
		
		
		
		
		
		
		
		scanner.close();
	}

}
