package co.ded.array;

public class ArrayExample7 {

	public static void main(String[] args) {
		String[] days = { " 일 ", " 월 ", " 화 ", " 수 ", " 목 ", " 금 ", " 토 " };
		int month = 1;
		int lnth = getLastDay(1);
		int[] intAry = new int[lnth];
		// 배열값을 지정.
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = i + 1;
		}
		// 요일 출력.
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();

		int spc = getDayInfo(month);
		for (int i = 0; i < spc; i++) {
			System.out.printf("%4s", "*");
		}
		// 날짜 출력.
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf("%4d", intAry[i]);
			if ((i + spc) % 7 == 6) {
				System.out.println();
			}
		}

	} // 메인 메소드

	public static int getLastDay(int month) {
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return 31;
		case 2:
			return 28;
		case 4: case 6: case 9: case 11:
			return 30;
		default:
			return 0;
		}

	}
	// 요일 ㅓㅈㅇ보
	public static int getDayInfo(int month) {
		switch (month) {
		case 1: case 10:
			return 6; 
		case 2: case 3: case 11:
			return 2;
		case 4: case 7:
			return 5; 
		case 5:
			return 0;
		case 6:
			return 3;
		case 8:
			return 1;
		case 9: case 12:
			return 4;
		default:
			return 0;
		}
	}
}
