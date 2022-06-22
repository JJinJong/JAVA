package day02;

public class FormatTest {
	public static void main(String[] args) {
		String name = "한동석";
		int age = 20;
		double weight = 81.54;

		
		
		//									서식문자, 변수 <-서식문자에 변수가 들어감
		System.out.printf("이름 : %s", name);
		//서식문자를 사용해서 나이와 몸무게 출력
		System.out.printf("나이 : %d\n", age);
		//%f에서 소수점을 자르면 반올림된다.
		System.out.printf("몸무게 : %.1fkg\n", weight);
	}
}
