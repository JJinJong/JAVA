package exceptionTest;

public class ExceptionTest1 {
	public static void main(String[] args) {
		//모든 예외의 부모가 Exception
		//4칸 배열을 만들고 인덱스로 접근할 때 0~4범위를 벗어나면
		//다시 시도해 주세요 출력
		//단축키 alt + shift + z
		int[] arData = new int[4];
	
		try {
			System.out.println(arData[4]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index 4 out of bounds for length 4");
			System.out.println("다시 시도해 주세요");
		}
		
//		try {
//			System.out.println(10/0);
//		} catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다");
//		}
//		System.out.println("반드시 실행해야  되는 문장");
		
	}
}
