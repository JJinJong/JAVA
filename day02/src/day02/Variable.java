package day02;

public class Variable {
	public static void main(String[] args) {
	//자료형 변수명 = 값;
	//자료형 변수형 = 초기값 => 초기화 : 변수에 값을 집어 넣은것
	//변수 사용 이유 : 1. 반복되는 값 쉽게 관리 가능, 2. 의미없는 값을 하나의 정보로 만들기 위해서(자료구조)
		int age = 10;
		//초기화 안하고 선언 가능
		int num;
		//초기화 안했기에 출력될 값이 없는 것 
		//반드시 초기화 해줘야함
//		System.out.println(num);
		float interestRate = 2.5284F;
		double score = 2.5284;
		char grade = 'A';
		String data = "ABC";
		
		System.out.println(age);
		System.out.println(interestRate);
		System.out.println(score);
		System.out.println(grade);
		System.out.println(data);
		
		/*
		 * RAM(메모리)
		 * OS kernel space	: 드라이버
		 * Stack					: 지역 변수, 매개 변수
		 * Heap					: 동적 메모리
		 * BSS					: 직접 초기화되지 않는 전역 변수 Q.변수만 선언한 건가?
		 * Data영역				: 전역 변수, 정적 변수
		 * Test영역				: 상수, 코드
		 * 
		 */
		
		
	}
		
}
