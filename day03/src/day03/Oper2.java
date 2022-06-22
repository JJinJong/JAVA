package day03;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
		//두 정수 입력받고 대소 비교
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 =0;
		String result = null;
		String q1Msg = "첫번째 정수를 입력해주세요";
		String q2Msg = "두번째 정수를 입력해주세요";
		
		System.out.println(q1Msg);
		num1 = sc.nextInt();
		System.out.println(q2Msg);
		num2 = sc.nextInt();
		//삼항 연산자 연속사용
		//	  num1이 num2보다 크니? ? 맞으면 큰값 : num1 : 틀리면 num1이 num2랑 같니? ? 맞으면 두수가 같습니다
		//	  아니면 큰 값은 num2
		result = num1 > num2 ? "큰 값 : "+num1 : num1 == num2 ? "두 수가 같습니다." : "큰 값 : " +num2;
		System.out.println(result);
	}
}
