package day03;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
		//심리 테스트
		/*
		 * Q. 당신이 좋아하는 색을 선택하세요
		 * 1. 빨간색
		 * 2. 노란색
		 * 3. 검은색
		 * 4. 흰색
		 * 
		 * 빨간색 : 불같고 열정적이고 적극적이다.
		 * 노란색 : 발랄하고 밝고 귀엽고 개성있고 유하다
		 * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다 그리고 강하다.
		 * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		 *
		 * 삼항연산자 사용!
		 */
		String qMsg = "Q. 당신이 좋아하는 색을 선택하세요\n"
				+ "1. 빨간색\n"
				+ "2. 노란색\n"
				+ "3. 검은색\n"
				+ "4. 흰색";
		String a1Msg = "빨간색 : 불같고 열정적이고 적극적이다.";
		String a2Msg = "노란색 : 발랄하고 밝고 귀엽고 개성있고 유하다.";
		String a3Msg = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다 그리고 강하다.";
		String a4Msg = "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMsg = "잘못입력하였습니다";
		String resultMsg = null;
		int choice  = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(qMsg);
		choice = sc.nextInt();
		
		resultMsg = 
		choice == 1 ? a1Msg : 
			choice == 2 ? a2Msg : 
				choice ==3 ? a3Msg : 
					choice == 4 ? a4Msg : errorMsg; 
		
		System.out.println(resultMsg);
	}
}
