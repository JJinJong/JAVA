package day02;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		//두 정수를 입력한 후 덧셈 결과 출력
		//단, next()만 사용
//		두 정수를 저장할 변수 두 개 선언
//		입력 클래스 타입의 변수 선언
//		출력할 메세지 변수에 저장
//		출력
//		입력메소드 사용
//		입력한 값을 변수에 저장
//		출력
//		입력메소드 사용
//		입력한 값을 변수에 저장
//		저장된 입력한 값을 정수로 형변환
//		정수로 형변환된 값을 +연사자로 연산
//		결과 출력
		Scanner sc = new Scanner(System.in);		
		String q1Msg = "첫번쨰 정수를 입력하세요";
		String q2Msg = "두번쨰 정수를 입력하세요";
		int num1 = 0, num2 =0;
		int result = 0;
		
		System.out.println(q1Msg);
//		num1 = sc.nextInt();
		num1 = Integer.parseInt(sc.next());
		System.out.println(q2Msg);
//		num2 = sc.nextInt();
		num2 = Integer.parseInt(sc.next());

//		result = num1 + num2;
		
		System.out.printf("%d + %d = %d", num1 , num2 , num1+num2 );
//		System.out.println(result);
				
	}
}
