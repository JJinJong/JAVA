package day03;

public class Oper5 {
	public static void main(String[] args) {
		int data = 10;
		//data는 출력됐지만 data+1해준 값은 출력 x, 단 data=11상태임
		System.out.println(data++);
		//출력하면 11나옴
		System.out.println(data);
		//data+1하고 출력함, 따라서 12가 나옴
		System.out.println(++data);
		System.out.println(data);
	}
}
