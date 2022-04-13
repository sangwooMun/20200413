package co.ded.dimension;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studnetNum = 0;
		int[] scores = {1, 2, 3};

		while (run) {
			System.out.println("#############################################");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("#############################################");
			System.out.print("선택");

			int selectNo = Integer.parseInt(scanner.nextLine());
			
			// 잘못된 순서를 처리 하려는 겨웅에 대해서 메세지 보여주기
			if(scores == null) {
				if(selectNo == 2 || selectNo == 3 || selectNo == 4) {
					System.out.println("학생수를 지정하세요");
					continue;
				}
			}
					
			if (selectNo == 1) {
				System.out.println("학생수 : ");
				studnetNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studnetNum];
				
			} else if (selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println();
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				for(int i=0; i <scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			} else if (selectNo == 4) {
				int maxVal, sum;
				maxVal = sum = 0; // 변수 초기화
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					//최고점수
					if(scores[i] > maxVal) {
						maxVal = scores[i];
					}
				}
				System.out.println("최고 점수 : " + maxVal);
				System.out.printf("평균 점수 : %.2f", (double) sum / scores.length);
				System.out.println();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}

}
