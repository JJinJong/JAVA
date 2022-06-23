package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		// 5개의 정수만 입력받기
		// -무한 입력 가능
		// -q를 입력하면 나가가ㅣ
		// -5개의 정수는 배열에 담기
		// -if문은 딱 한번만 사용하기
//		 Scanner sc = new Scanner(System.in);
//	      String msg = "번째 정수 입력[q: 나가기]";
//	      String input = null;
//	      int[] aryNum = new int[5];
//	      int cnt = 0;
//		
//		try {
//			while(true) {
//				System.out.println(++cnt+msg);
//				input = sc.next();
//				if(input.toLowerCase().equals("q")) {break;}
//				aryNum[cnt-1] = Integer.parseInt(input);
//			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("이미 5번 입력하셨습니다");
//			while(true) {
//				System.out.println(++cnt+msg);
//				input = sc.next();
//				if(input.equals("q")) {break;}
//			}
//		} 
//		
//		for (int i = 0; i < aryNum.length; i++) {
//			System.out.println(aryNum[i]);
//		}
		Scanner sc = new Scanner(System.in);
		String msg = "번째 정수 입력[q: 나가기]";
		String temp = null;
		int[] arData = new int[5];
		int cnt = 0;

		while (true) {
			System.out.println(++cnt + msg);
			temp = sc.next();
			// toLowerCase()는 String 클래스에 선언된 메소드이다.
			// 대문자를 모두 소문자로 바꿔주는 기능을 한다.
			if (temp.toLowerCase().equals("q")) {
				break;
			}
			try {
				arData[cnt - 1] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("입력하기 전에 생각이란 걸 해봤나요?");
				cnt--;
			} catch (ArrayIndexOutOfBoundsException q) {
				System.out.println("입력하신 수가 5번을 넘었습니다.");
				System.out.println("나가기 q를 눌러주세요");
				cnt--;
			}

		}
		for (int j = 0; j < arData.length; j++) {
			System.out.println(arData[j]);
		}

	}
}