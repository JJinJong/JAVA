package variable;

public class Variable2 {
	public static void main(String[] args) {
		
//		System.out.println(Math.ceil(10.1));
		
		
		Variable1 v1 = new Variable1();
		Variable1 v2 = new Variable1();
////		
		//객체가 달라서 아무리 v1을 수정해도 v2는 변화없음
		v1.data = 20;
		System.out.println(v2.data);
////		
//		//v2.로 객체화 해도 되지만 어차피 공유되니깐
//		//클래스명으로 직접 떄려 박아서 소환
//		Variable1.data_s = 100;
//		//data_s는 static이라 접근 가능
//		System.out.println(v2.data_s);

		Variable1 v = new Variable1();
		
		//Data_s메소드는 static을 증가시키는 메소드고
		//도중에 객체를 만들어 메소드를 써도 Variable1의 전역변수 data_s는 증가함
//		v.increaseData_s();
//		v.increaseData_s();
//		v.increaseData_s();
//		v = new Variable1();
//		v.increaseData_s();
//		v.increaseData_s();
//		v.increaseData_s();
		
		v.increaseData();
		v.increaseData();
		v.increaseData();
		v.increaseData();
////		static이 아니라 공유 안함
		v = new Variable1();
		v.increaseData();
		v.increaseData();
		
	}
}
