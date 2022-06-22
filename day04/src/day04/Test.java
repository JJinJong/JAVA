package day04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String input = "";
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어를 입력해주세요");
		input = sc.next();
		//오류가 났떤 이유 arg.length여서 구체적 범위 안 정해줌
		for (int i = 0; i < input.length(); i++) {
//			System.out.println("들어옴3");
			char c = input.charAt(i);
			if(c >= 65 && c <= 90) {
				result += (char)(c+32);
//				System.out.println("들어옴");
			}else if( c >= 97 && c <= 122) {
				result += (char)(c-32);
			}else {
				result += c;
//				System.out.println("들어옴1");
			}
		}
		System.out.println(result);
	}
}