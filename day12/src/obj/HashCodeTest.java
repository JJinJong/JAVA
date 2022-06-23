package obj;

import java.util.Random;

public class HashCodeTest {
	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";
		String data3 = new String("ABC");
		String data4 = new String("ABC");
		String data5 = new String("ABD");
		// 왜 해쉬 코드가 같지??
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		System.out.println(data3.hashCode());
		System.out.println(data4.hashCode());
		System.out.println(data5.hashCode());
		// 값 비교이므로 true
		System.out.println(data1.equals(data2));
		// 값 비교이므로 true
		System.out.println(data3.equals(data4));
		// 주소값이 다르므로 false
		System.out.println(data3 == data4);
//		Random r1 = new Random();
//		Random r2 = new Random();
//		
//		System.out.println(r1.hashCode());
//		System.out.println(r2.hashCode());

	}
}
