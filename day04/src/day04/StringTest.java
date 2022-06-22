package day04;

public class StringTest {
	public static void main(String[] args) {
		String data = "ABC";
		String scores = "10,20,30";
		//String은 Class라 메소드로 
		//length에 ()이 붙은 이유 배열과는 다름
//		int arData[] = {1,2,3};
//		System.out.println(arData.length); /*신기하네 length는 전역변수?*/
		System.out.println(data.length());
		//배열 처럼 생각하자
		System.out.println(data.charAt(1));
		//구분 점이 있을 때 ","
		//스플릿으로 배열을 나눌 때 문자열로 나눔
		//scores.split(",")는 String이 맞네 .getClass().getSimpleName()
//		System.out.println(scores.split(",")[1].getClass().getSimpleName());
		System.out.println(scores.split(",")[1]);
		//구분 점이 없을 때 그냥 ""
		System.out.println(data.split("")[1]);
	}
}
