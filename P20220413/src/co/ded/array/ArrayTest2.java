package co.ded.array;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
//		int[][] intAry = new int[4][3];
//		
//		intAry[0][0] = 10;
//		intAry[0][1] = 20;
//		intAry[1][0] = 30;
//		intAry[0][2] = 40;
//		
//		for(int i =0; i<intAry.length; i++) {
//			for(int j= 0; j<intAry[3].length; j++) {
//				System.out.println();
//				System.out.println(intAry[i][j]);
//			}
//		}
////////////////////////////////////////////////////////////
//		int[][] score = { {10, 20, 30}, 
//				{40, 50, 60, 90}, 
//				{70, 80} };
//		
//		double avg = 0;
//		int sum = 0;
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				sum += score[i][j];
//				avg =(double) sum/ score[i].length;
//			}
//			System.out.println(sum);
//			System.out.println(avg);
//			System.out.println();
//		}
////////////////////////////////////////////////////////////
		Scanner scanner = new Scanner(System.in);

		int num1, num2, num3;
		System.out.println("첫 값 입력 >");
		num1 = scanner.nextInt();
		System.out.println("둘 값 입력 >");
		num2 = scanner.nextInt();
		System.out.println("셋 값 입력 >");
		num3 = scanner.nextInt();

		int[] intAry = { num1, num2, num3 };

		for (int j = 0; j < intAry.length - 1; j++) {
		for (int i = 0; i < intAry.length - 1; i++) {
				if (intAry[i] > intAry[i + 1]) {
					int num = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = num;
				}
			}
		}
		System.out.println(intAry[0] + "," + intAry[1] + "," + intAry[2]);
		scanner.close();
	}

}
