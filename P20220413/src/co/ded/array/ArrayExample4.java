package co.ded.array;

public class ArrayExample4 {

	public static void main(String[] args) {
		
		int[] intAry = new int[5];
		int sum = 0;
		// 반복문 활용. 임의의 값 5개 넣어주기.
		// x, x, x, x, x
		// 15보다 큰 값만 합계 > 평균.
		for(int i=0; i<intAry.length; i++) {
			intAry[i] =(int) (Math.random() * 30) + 1; // 1 ~ 30 범위의 임의 값.
		}
		for(int i=0; i<intAry.length; i++) {
			if(intAry[i] > 15) {
				sum += intAry[i];
			}
//			System.out.println(intAry[i]);
		}
		System.out.println();
		System.out.println(sum);
		
	}

}
