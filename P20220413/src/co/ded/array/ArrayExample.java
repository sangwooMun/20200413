package co.ded.array;

public class ArrayExample {

	public static void main(String[] args) {
		// 30명 학생의 점수
		int score1 = 80;
		
		
		// 여러개의 같은 유형의 값을 저장.
		int[] intArray = new int[30]; // 정수int를 30개 담을 수 있는 공간.
		
		intArray[0] = 30;
		intArray[4] = 40;
		intArray[29] = 55;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[4]);
		System.out.println(intArray[29]);
		
		double[] dblArray = new double[10]; // double형태의 저장 공간 10개 생성.
		
		String[] strArray = new String[5]; // 참조변수값은 기본 null.
		System.out.println(strArray[0]);
		
		int[] otherArray = {10, 20, 30, 40}; // 초기값을 지정.
		int[] theOtherArray = {10, 20, 30, 40};
		System.out.println(otherArray[0]);
		System.out.println(otherArray[1]);
		System.out.println(otherArray[2]);
		
		//if(otherArray == theOtherArray) { // 주소값을 비교하기 때문에 다름.
		if(otherArray[0] == theOtherArray[0]) { // 배열값일 경우 같음.
		System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}
