package day02;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		//Ctrl + space
		//Ctrl + Shift + o 불필요한 import나 변수 선언 없애는 단축키
		
		Scanner sc = new Scanner(System.in);
		/*초기값
		 * 정수	: 0
		 * 실수	: 0.0
		 * 	문자	: ' '
		 * 문자열 : "", null
		 */
		String name =null;
		String name2 = null;
		
//		System.out.print("이름 : ");
//		name = sc.nextLine();
//		System.out.println(name+"님 환영합니다.");
		/*사용자가 입력한 문자열 값, 공백, \n을 구분점으로 삼아 나눠줌 
		 * ex)한 동석이면 sc.next()를 두번써야함
		 */
//		System.out.println(name+sc.next()+"님 환영합니다");
		
		//공백을 기준으로 하기 때문에 진 세종 입력하면 name에 진이 name2에 세종이 담김
		System.out.print("이름 : ");
		name = sc.next();
		name2 = sc.next();
		System.out.println(name+name2+"님 환영합니다.");
		
		
	}
}
