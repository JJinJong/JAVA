package day03;

public class ForTest {
	public static void main(String[] args) {
		//이름 10번 출력
		
//		for (int i = 0; i < 10; i ++) {
//			System.out.println(i+1+".진세종");
//		}
		//이름 10번 출력, 10~1까지 출력
		//이름 10번 출력, 10~20까지 출력
		
//		for (int i = 9; i < 19; i++) {
//			System.out.println(i+1+".진세종");
//		}
//			System.out.println("20.");
//		for (int i = 10; i > 0; i--) {
//			System.out.println(i+".진세종");
//		}
//		int end = 10;
//		for (int i = 0; i < end; i++) {
//			System.out.println(i + 10 + (end == 11 ? ". " :".한동석"));
//			if(i == 9) {end++;}
//		}
		for (int i = 0; i < 11; i++) {
			System.out.println(i + 10 + (i == 10 ? ". " :".한동석"));
		}	
	}
}
