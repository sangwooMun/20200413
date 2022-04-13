package co.ded.array;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] intArray = {10, 20, 30, 40, 50};
		
		int maxVal = 0;
		int sum = 0;
		for(int i = 0; i<5; i++) {
			System.out.println(intArray[i]);
			if(maxVal < intArray[i]) {
				maxVal = intArray[i];
			}
			sum += intArray[i];
		}
		System.out.println("최대값 : " + maxVal);
		System.out.println("합계 : " + sum);
	}

}
