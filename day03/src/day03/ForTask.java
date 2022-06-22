package day03;

public class ForTask {
	public static void main(String[] args) {
		//브론즈
		//1~100출력
		
		//100~1까지 출력
		//1~100까지 중 짝수만 출력
		
		//실버
		//1~10까지 합 출력
		//1~n까지 합 출력
		
		//골드
		//A~F까지 출력
//		for (char i = 'A'; i < 'G'; i++) {
//			if(i == 'C') {continue;}
//			System.out.println(i);
//		}
		//A~f중 C제외하고 출력
		
		//다이아
		//012301230123출력
		//aBcDeFg...Z출력
		
		//1~100
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i+1);
//		}
		
		//100~1
//		for (int i = 0; i < 100; i++) {
//			System.out.println(99-i+1);
//		}
		
		//*가 있네 
//		for (int i = 1; i < 51; i++) {
//			System.out.println(i+i);
//		}
		
//		int result = 0;
//		for (int i = 0; i < 11; i++) {
//			result += i;
//		}
		
//		System.out.println(result);

//		int result = 0;
//		int end = 0;
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("수 입력");
//		end = sc.nextInt();
//		for (int i = 0; i < end; i++) {
//			result += i;
//		}
//		System.out.println(result);
		
		//char 타입 변수를 굳이 안만들어도 가능 
//		char age = 'A';
//		for (int i = 0; i < 6; i++) {
//			System.out.println((char)(age+i));
//		}

//		for (char i = 'A'; i < 'G'; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println((char)(i +(i>1 ? 66 : 65)));
//		}
		
//		for문에 for문 말고 다른 식으로 해보기
//		for (int j = 0; j < 3; j++) {
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i);
//			}
//		}
		//나머지를 이용한 방법
//		for (int i = 0; i < 12; i++) {
//			System.out.println(i % 4+" ");
//		}
//	 aBcDeFg...Z출력
		//아스키 코드
//		for (int i = 0; i < 26; i++) {
//			System.out.println((char)(i+(i % 2 == 0 ? 97 : 65)));
//		}
		
	}
}
