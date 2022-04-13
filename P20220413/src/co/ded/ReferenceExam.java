package co.ded;

public class ReferenceExam {

	public static void main(String[] args) {
		// 기본타입.
		int num1 = 100;
		int num2 = 100;
		
		if(num1 == num2) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
		
		// 참조타입.
		String str1 = new String("홍길동"); // 인스턴스
		String str2 = new String("홍길동"); // 인스턴스
		str1 = null;					// 두개의 주소값이 다르다.
		str1 = "김길동";
		
//		if(str1 == str2) { // 참조변수에서 == 는 주소값으로 비교하기에 다름.
		if(str1.equals(str2)) { // 값을 비교하려면 equals메소드로 비교.
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
	}

}
