package co.ded.dimension;

public class ArrayExample {

	public static void main(String[] args) {
//		int[][] intAry = new int[4][3];
//
//		intAry[0][0] = 10;
//		intAry[1][0] = 20;
//		intAry[3][2] = 100;
//
//		for (int j = 0; j < intAry.length; j++) {
//			for (int i = 0; i < intAry[3].length; i++) {
//				System.out.println("[" + j + "]" + "[" + i + "] > " + intAry[j][i]);
//			}
//			System.out.println();
//		}

		int[][] intcon = new int[5][5];
		int num = 1;

		for (int i = 0; i < intcon.length; i++) {
			for (int j = 0; j < intcon[i].length; j++) {
				intcon[i][j] = num;
				num += 1;
//				System.out.printf("%4s", intcon[j][i]);
			}
			System.out.println();
		}
		for (int i = 0; i < intcon.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < intcon[i].length; j++) {
					System.out.printf("%4s", intcon[i][j]);
				}
			}
			if (i % 2 == 1) {
				for (int j = 4; j >= 0; j--) {
					System.out.printf("%4s", intcon[i][j]);
				}
			}
			System.out.println();
		}

//		for (int i = 4; i >= 0; i--) {
//			for (int j = 4; j >= 0; j--) {
//				System.out.printf("%4s", intcon[i][j]);
//			}
//			System.out.println();
//		}

	}

}
