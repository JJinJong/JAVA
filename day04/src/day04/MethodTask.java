package day04;

import java.util.Scanner;

public class MethodTask {
	// 아이언
	// 1~10까지 println()으로 출력하는 메소드
	//출력이라 void, return이 없음
	//그냥 10번 출력이니깐 변수 딱히 필요없음 맞나?
	void print(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
	//"홍길동"을 n번 println()으로 출력하는 메소드
	//변수가 n이니깐 n을 num으로 두자
	void print2(int num){
		for (int i = 0; i < num; i++) {
			System.out.println(i+1+".번째 : 홍길동");
		}
	}
	
	//브론즈
	//이름을 n번 println()으로 출력하는 메소드
	 void naming(String name, String name2) {
		 //의미 없다 이건 main에서 출력해야지 메소드에서 의미 없는듯?
		 //System.out.println("이름과 숫자를 입력해주세요\nex)\"세종\", \"5\"");
		//String으로 받았으니 Inter해주기
		 for (int i = 0; i < Integer.parseInt(name2) ; i++) {
			System.out.println(i+1+".번째 : "+name);
		}
	}
	//세 정수의 뺼셈을 해주는 메소드
	int remove(int num1, int num2){
			return num1 - num2;
			
	}
	//실버
	//두 정수의 나눗셈을 해주는 메소드 (몫과 나머지)
	
	int[] div(int num1, int num2){
		int[] result = null;
		result = new int [2];
		if(num2 == 0) {
			System.out.println("분모는 0이 될 수 없습니다.");
		}else {
			result[0] = num1 / num2;
			result[1] = num1 % num2;
			
		}
			return result;
	}
	
//	int[] div(int num1, int num2){
//		int[] result = null;
//		if(num2 !=0) {
//			result = new int[2];
//			result[0] = num1 / num2;
//			result[1] = num1 % num2;
//		}
//		return result;
//	}
	//1~n까지의 합을 구해주는 메소드
		
		void sum (int num) {
			int result = 0;
			for (int i = 0; i < num; i++) {
				result += i+1;
			}
			System.out.println(result);
		}
	//리턴으로 왜오류 났지?
//		int sum (int num) {
//			int result =0;
//			for (int i = 0; i < num; i++) {
//				result += i+1;
//			}
//			return result;
//		}
	//골드
	//홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
		int change (int num){
			if(num % 2 == 0) {
				num++;
			}else {
				num++;
			}
			return num;
		}
	//문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
		
		String chagne2 (String name){
				String result = "";
			for (int j = 0; j < name.length(); j++) {
				char c = name.charAt(j);
			if(c >= 65 && c <= 90) {//대문자
				result += (char)(c+32);
			}else if(c >= 97 && c <= 122) {//소문자
				result += (char)(c-32);
			}else {// 그 이외의 문자
				result += c;
			}
		}
			return result;
		}
		
		
	//플래티넘
	//문자열을 입력받고 원하는 문자의 개수를 구해주는 구해주는 메소드
		int input(String msg){
			return msg.length();
		}
	//5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
				void input2(int num1, int num2) {
				num = new int[5];
				System.out.println(num[num1]);
				}
			
	//다이아
	//한글을 정수로 바꿔주는 메소드 (일공이사->1024)
//		change3(Sting name){
//			String num = "0123456789";
//			
//		}
	
	//마스터
	//5개의 정수를 입력받고 최대값과 최소값을 구해주는 void형 메소드(메소드 안에서 출력 금지, 리턴타입은 void)
	
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
//		m.print();
//		m.print2(10);
//		m.naming("진세종", "5");
//		System.out.println(m.remove(134, 137));
//		m.div(30, 10);
//		m.div(30, 0);
//		System.out.println(m.div(32, 11)[0]);
//		System.out.println(m.sum(30));
//		System.out.println(m.change(43));
		Scanner sc = new Scanner(System.in);
//		String choice = "";
//		System.out.println("문자열 입력");
//		choice = sc.next();
//		System.out.println(m.chagne2(choice));
//		m.input("안녕하세요");
//		System.out.println(m.input("sdfasdf"));
//		String choice = "";
//		System.out.println("수 입력 \nex)1 ,3 ,4 ,5 ,7 ");
//		choice = sc.next();
//		System.out.println(m.div(33, 22)[1]);
//		m.input2(choice);
		m.input2({3,4,5,6,7}, 5);
	}
}
