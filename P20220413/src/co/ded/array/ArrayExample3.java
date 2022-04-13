package co.ded.array;

public class ArrayExample3 {

	public static void main(String[] args) {
		int[] intArray = {78, 83, 88, 92, 63};
		
		// 배열의 합 구하기. sum
		// double avg 평균.
		System.out.println(intArray.length);
		int sum = 0;
		int som = 0;
		double cnt = 0;
		double avg = 0;
		
		for(int i=0; i< intArray.length; i++) {
			if(intArray[i] % 2 == 0) {
				som += intArray[i];
				cnt++;
				avg = som/cnt;
			}
			sum += intArray[i];
		}
		
		System.out.println("짝수의 합은 : " + som);
		System.out.println("합은 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
