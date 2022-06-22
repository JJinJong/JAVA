package day02;

public class ConstantTest {
	public static void main(String[] args) {
		//상수명은 전부 대문자
		final int SALARY = 3000;
		int num = 3004;
//		salary = 10000; 수정 불가, final을 쓰는 선언부에서 직접 수정
		System.out.println(SALARY);
		System.out.println(num);
		//상수, final로 묶어나서 값 변경 불가, 변경시 직접 final로 선언한 부분에 가서 수정해야함ㄴ
		//		SALARY = 300;
		System.out.println(SALARY);
		num = 332;
		System.out.println(num);
		
	}
}
