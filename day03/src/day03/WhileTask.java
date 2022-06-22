package day03;

import java.util.Scanner;

public class WhileTask {
	public static void main(String[] args) {
	String qMsg = "Q. 당신이 좋아하는 색을 선택하세요\n"
			+ "1. 빨간색\n"
			+ "2. 노란색\n"
			+ "3. 검은색\n"
			+ "4. 흰색\n"
			+ "5. 나가기";
	String redMsg = "빨간색 : 불같고 열정적이고 적극적이다.";
	String yellowMsg = "노란색 : 발랄하고 밝고 귀엽고 개성있고 유하다.";
	String blackMsg = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다 그리고 강하다.";
	String whiteMsg = "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
	String errorMsg = "잘못입력하였습니다";
	String resultMsg = null;
	
	int choice  = 0;
	Scanner sc = new Scanner(System.in);
	
	while(choice != 5) {
		System.out.println(qMsg);
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			resultMsg = redMsg;
			break;
		case 2:
			resultMsg = yellowMsg;
			break;
		case 3:
			resultMsg = blackMsg;
			break;
		case 4:
			resultMsg = whiteMsg;
			break;
		case 5 :
			resultMsg = "종료합니다";
			break;
		default :
			resultMsg = errorMsg;
			break;
		}
		//이상태로 실행했을때 오류가 나는 이유 break;를 안썼을때
		//1.무조건 default로 갈때
		//2.순서대로 다 읽다보니 결국 errorMsg가 입력된것
			
	
		System.out.println(resultMsg);

	 	}
	}
}
