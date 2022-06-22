package inheritance;

class A {
	String name = "A";
	int data = 10;

	public A() {
		System.out.println("부모 생성자 호출");
	}
}

class B extends A {
	String name = "B";

	public B() {
		System.out.println("자식 생성자 호출");
	}
	// 클래스 명 Ctrl + space 하면 생성자 단축키

	void printData() {
		System.out.println(data);
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		//B생성자를 만들어 객체화 시켰지만 부모의 생성자가 호출되고 자식의 생성자 호출됨
		B b = new B();
		//A, B둘다 전역변수 name이 있지만 B의 name이 사용됨
		System.out.println(b.name);
		b.printData();
	}

}
