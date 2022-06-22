package day05;

class A{
	int data = 100;
	
	A(){
		System.out.println("안녕");
	}
	
	void printData() {
		System.out.println(data);
	}
	
}

public class ClassTest {
	public static void main(String[] args) {
		//A()은 {}가 없으니 사용인데 어디서 선언했니?
		//바로 클래스 선언시 기본생성자가 만들어 졌던거
		//A()에서 "안녕"이라는 말이 나온거
		A a=new A();
//		System.out.println(a);
		a.data = 200;
		a.printData();
	
	}
}
