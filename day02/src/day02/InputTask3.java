package day02;

import java.util.Scanner;

public class InputTask3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 ="", num2 ="", num3="";
		String qMsg = "3개의 정수를 입력하시오 : \n 예)3 5 7";
		int result = 0;
		
		System.out.println(qMsg);
		num1 = sc.next();
		num2 = sc.next();
		num3 = sc.next();
		
		result = Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3);
		
		System.out.println(String.format("%d", result));
		
	}
}
