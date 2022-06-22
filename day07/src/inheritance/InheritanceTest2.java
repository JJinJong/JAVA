package inheritance;

class Human {
int data = 10;
	void eat() {
		System.out.println("먹기");
	}

	void sleep() {
		System.out.println("자기");
	}

	void walk() {
		++data;
		System.out.println("두 발로 걷기");
	}
}

class Monkey extends Human {
	void eatLouse() {
		System.out.println("냠냠");
	}
	
	@Override
	void walk() {
		super.walk();
		++data;
		System.out.println("네 발로 걷기");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		Human hu = new Human();
		kingkong.walk();
		hu.walk();
		System.out.println(kingkong.data);
		System.out.println(hu.data);
	}

}
