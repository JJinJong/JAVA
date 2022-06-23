package lambda;

public class LambdaTest {
	public static void main(String[] args) {
		//int 생략가능 어차피 메소드가 하나라 알수있음
		LambdaInter lambda1 = (int number)-> number %10 ==0;
		boolean check = lambda1.checkMultipleOf10(10);
		System.out.println(check);
		
		//10의 배수 검사를 출력하고 리턴한다
		LambdaInter lambda2 = (int number)-> {
			System.out.println("10의 배수검사"); 
			return number % 10 ==0;
		};
		boolean check2 = lambda2.checkMultipleOf10(10);
		System.out.println(check);
		
		
//		boolean check = new LambdaInter() {
//			@Override
//			public boolean checkMultipleOf10(int num) {
//				return num%10 ==0;
//			}
//		}.checkMultipleOf10(10);
//		System.out.println(check);
	
	}
}
