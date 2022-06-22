package day05;

public class MethodTask {
	// 아이언
	// 1~10까지 println()으로 출력하는 메소드
	void printFrom1To10(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
	
	//출력이라 void, return이 없음
	//그냥 10번 출력이니깐 변수 딱히 필요없음 맞나?
//	void print(){
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i+1);
//		}
//	}
	
	//"홍길동"을 n번 println()으로 출력하는 메소드
	void printHong(int time){
		for (int i = 0; i < time; i++) {
			System.out.println("홍길동");
		}
	}
	
	//변수가 n이니깐 n을 num으로 두자
//	void print2(int num){
//		for (int i = 0; i < num; i++) {
//			System.out.println(i+1+".번째 : 홍길동");
//		}
//	}
	
	//브론즈
	//이름을 n번 println()으로 출력하는 메소드
	
	void printName(String name, int time){
		for (int i = 0; i < time; i++) {
			System.out.println(name);
		}
	}
//	 void naming(String name, String name2) {
//		 //의미 없다 이건 main에서 출력해야지 메소드에서 의미 없는듯?
//		 //System.out.println("이름과 숫자를 입력해주세요\nex)\"세종\", \"5\"");
//		//String으로 받았으니 Inter해주기
//		 for (int i = 0; i < Integer.parseInt(name2) ; i++) {
//			System.out.println(i+1+".번째 : "+name);
//		}
//	}
	 
	//세 정수의 뺼셈을 해주는 메소드
	int sub(int num1, int num2, int num3){
		return num1 - num2 - num3;
	}
	
	//	세자리 정수가 아니구나
//	int remove(int num1, int num2){
//			return num1 - num2;
//			
//	}
	
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
	
	int getTotalFrom1(int end){
		int total = 0;
		for (int i = 0; i < end; i++) {
			total += i + 1;
		}
		return total;
	}
	
//		void sum (int num) {
//			int result = 0;
//			for (int i = 0; i < num; i++) {
//				result += i+1;
//			}
//			System.out.println(result);
//		}
	
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
	
	int change(int num){
		return ++num;
	}
	
//		int change (int num){
//			if(num % 2 == 0) {
//				num++;
//			}else {
	//?????? 그냥 ++num해도 되겠네
//				num++;
//			}
//			return num;
//		}
	
	
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
		int getCount(String str, char c){
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == c) {
					count++;
				}
			}
			return count;
		}
		
		
		int input(String msg){
			return msg.length();
		}
		
	//5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
		
		int getValue(int[] arData, int ordinal){
			return arData[ordinal-1];
		}
		
//				void input2(int num1, int num1) {
//				num = new int[5];
//				System.out.println(num[num1]);
//				}
			
	//다이아
	//한글을 정수로 바꿔주는 메소드 (일공이사->1024)
		int changeToInteger(String hangle){
			String hangleOri = "공일이삼사오육칠팔구";
			String result = "";
			for (int i = 0; i < hangle.length(); i++) {
				result += hangleOri.indexOf(hangle.charAt(i));
//				System.out.println("hangle.charAt(i)"+hangle.charAt(i));
			}
			return Integer.parseInt(result);
		}
		
//		change3(Sting name){
//			String num = "0123456789";
//			
//		}
	
		
		
	//마스터
	//5개의 정수를 입력받고 최대값과 최소값을 구해주는 void형 메소드(메소드 안에서 출력 금지, 리턴타입은 void)
		//a라는 영역, main을 b라는 영역
		//b영역에서 a영역에 주소를 줄것
		void getMaxAndMin(int[] arData, int[] result) {
			//최대값
			result[0] = arData[0];
			//최소값
			result[1] = arData[0];
			
			for (int i = 1; i < arData.length; i++) {
				if(result[0]<arData[i]) {result[0] = arData[i];}
				if(result[1]>arData[i]) {result[1] = arData[i];}
			}
		}
		
		
	public static void main(String[] args) {
		//정수에서 쉼표 대신_를 사용한다.
		//1,000,000
		
		MethodTask m = new MethodTask();
		//실행만하는 실행 메소드
//		m.printFrom1To10();
//		//"홍길동"을 n번 println()으로 출력하는 메소드
//		m.printHong(10);
//		//이름을 n번 println()으로 출력하는 메소드
//		m.printName("세종", 5);
//		//세 정수의 뺼셈을 해주는 메소드
//		int result = m.sub(30, 20, 10);
//		System.out.println(result);
		//1~n까지의 합을 구해주는 메소드
//		int result = m.getTotalFrom1(10);
//		System.out.println(result);
		//홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
//		int result = m.change(3);
//		String msg = result % 2 == 0 ? "홀수에서 짝수로 바뀌었습니다" :"짝수에서 홀수로";
//		System.out.println(msg);
		//문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//		String result = m.chagne2("SDFsdfsdf@!");
//		System.out.println(result);
		//문자열을 입력받고 원하는 문자의 개수를 구해주는 구해주는 메소드
//		int count = m.getCount("ABCA", 'A');
//		System.out.println(count);
		//5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
//		int []arData = {1,2,3,4,5};
		//바로 넣어서 초기화하는거 찾아보기
//		System.out.println(m.getValue(arData, 3));
//		int[] arData = {1, 34, 64, 65, 12};
		
		//한글을 정수로 바꿔주는 메소드 (일공이사->1024
		System.out.println(m.changeToInteger("일공이사"));
		
		//5개의 정수를 입력받고 최대값과 최소값을 구해주는 void형 메소드(메소드 안에서 출력 금지, 리턴타입은 void)
//		int[] result = new int[2];
//		int[] arData = {1, 3, 6, 5, 2};
//		
//		m.getMaxAndMin(arData, result);
		
 	}
}
