package day04;

public class ArTest {
	public static void main(String[] args) {
		int[] arData = {3, 5, 1, 9, 7};
		int num = 0;
//		System.out.println(arData);
//		//[I@7d6f77cc <- 3의 주소값
//		//[배열 I는 자료형 타입
//		System.out.println(arData.length);
//		//5칸이라 5
		
//		double[]arData1 = {2, 4, 5};
//		System.out.println(arData1);
//		[D@5aaa6d82
//		타입 double이라 D
		
//		System.out.println(arData[0]+7);
////		//값이라 +로 출력가능
//		//2번째 칸
//		System.out.println(arData[1]);
//		//3번째 칸
//		System.out.println(arData[2]);
//		//4번째 칸
//		System.out.println(arData[3]);
//		//5번째 칸
//		System.out.println(arData[4]);
		
		//하나씩 출력
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		//한번에 출력?
		String name = "";
		for (int i = 0; i < arData.length; i++) {
			name += arData[i];
		}System.out.println(name);
		
		//5 4 3 2 1 넣고 출력
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[4-i]);
//		}
		
	      // 5 4 3 2 1 넣고 출력
//	      for (int i = 0; i < arData.length; i++) {
//	         arData[i] = 5 - i;
//	      }
//	      
//	      for (int i = 0; i < arData.length; i++) {
//	    	  System.out.println(arData[i]);
//	      }
	}
}