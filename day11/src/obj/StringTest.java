package obj;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data1 ="ABC";
		String data2 ="ABC";
		String data3 = new String("ABC");
		String data4 = new String("ABC");
		
		
		
		System.out.println(data1 == data2);
		System.out.println(data1.equals(data2));
		
		System.out.println(data3 == data4);
		System.out.println(data3.equals(data4));
	}
}
	