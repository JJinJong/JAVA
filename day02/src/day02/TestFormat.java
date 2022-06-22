package day02;

public class TestFormat {
	public static void main(String[] args) {
		
		
		int num1 =123;
		//정수만 가능
//		int num2 = 134.3;
		double num3 = 134.43;
		double num4 = 134;
		char alphabet = 'A';
		char alphabet2 = (char)65;
		char alphabet3 = 65;
		String blank = "dㄴㅁㅇ러314";
	
		
		System.out.println(alphabet);
		System.out.println(alphabet2);
		System.out.println(alphabet3);
		
		//서식문자 치환하는 방법 ("%d쓰고싶은말", %d에 넣고 싶은 변수) 단 변수랑 %랑 자료형 맞출것
		//%d는 int %f는 실수 %s는 문자열 %c는 문자 대표적 4개만 기억하자
		System.out.printf("%d번째오류\n", num1);
		//소수점 아래 0번째까지 출력
		System.out.printf("%.0f번째오류\n", num3);
		//소수점 아래 3번째까지 출력
		System.out.printf("%.3f번째오류\n", num3);
		System.out.printf("%f번째오류\n", num3);
		//134이지만 실수라 소수점 아래까지 출력됨
		System.out.printf("%f번째오류\n", num4);
		
		System.out.printf("%s\n", alphabet);
		System.out.printf("%s\n", alphabet2);
	}
}
