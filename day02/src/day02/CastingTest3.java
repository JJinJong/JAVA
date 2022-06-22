package day02;

public class CastingTest3 {
	public static void main(String[] args) {
		//1+"3"에서 이미 문자열 "13"+9=>"139"
		System.out.println(1+"3"+9);
		//"1"+3=>"13"+9=>"139"
		System.out.println("1"+3+9);
		//1+3=4+"9"=>"49"
		System.out.println(1+3+"9"); //연산후 형변환
		//Integer.parseInt("1")문자열을 정수로 변환
		//1+3+9=>13
		System.out.println(Integer.parseInt("1")+3+9); 
		
		//문자열이 너무 쎼서 다른 자료형과 붙으면 다 문자열이 됨
	}
}
