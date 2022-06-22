package day03;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		String qMsg = "Q. 당신이 좋아하는 색을 선택하세요\n"
				+ "1. 빨간색\n"
				+ "2. 노란색\n"
				+ "3. 검은색\n"
				+ "4. 흰색";
		String redMsg = "빨간색 : 불같고 열정적이고 적극적이다.";
		String yellowMsg = "노란색 : 발랄하고 밝고 귀엽고 개성있고 유하다.";
		String blackMsg = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다 그리고 강하다.";
		String whiteMsg = "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMsg = "잘못입력하였습니다";
		String resultMsg = null;
		
		int choice  = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(qMsg);
		choice = sc.nextInt();
		
		if(choice == 1) {
			//일괄처리
			resultMsg = redMsg;
		}else if(choice == 2) {
			resultMsg = yellowMsg;
		}else if(choice == 3) {
			resultMsg = blackMsg;
		}else if(choice == 4) {
			resultMsg = whiteMsg;
		}else {
			resultMsg = errorMsg;
		}
		//같은 값을 비교할 떄는 switch문
		System.out.println(resultMsg);
	}
}
