package day02;

public class CastingTest {
	public static void main(String[] args) {
		//자동 형변환
		System.out.println(11/9);
		System.out.println(11/9.0);
		System.out.println(11.0/9);
		System.out.println((double)11/9);
		System.out.println((int)(8.43+2.59));
		
		//8.43 + 2.59 = 10
		System.out.println((int)8.43 + (int)2.59);
		
		//아스키 코드에서 A는 65, 문자+34=>정수로 자동 형변환
		System.out.println('A'+34);
	}
}
