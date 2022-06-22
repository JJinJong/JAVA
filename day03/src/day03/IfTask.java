package day03;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		//두 정수를 입력 받고 대소 비교
		//if문 사용
		String q1Msg = "첫번째 정수를 입력하시오.";
		String q2Msg = "두번째 정수를 입력하시오.";
		String result = "";
		String equalMsg = "두 수가 같습니다.";
		String errorMsg = "잘못입력하였습니다.";
		int choice1 = 0, choice2 =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(q1Msg);
		choice1 = sc.nextInt();
		System.out.println(q2Msg);
		choice2 = sc.nextInt();
		
		if(choice1 > choice2) {
			result = choice1+"가 더 큽니다";
		}else if(choice1 < choice2) {
			result = choice2+"가 더 큽니다";
		}else {
			result = equalMsg;
		}
		System.out.println(result); 
	}
}
