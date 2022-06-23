package ambiguity;

public class ClassB extends ClassA implements InterA {
	public static void main(String[] args) {
		//하나의 자식이 여러 부모를 상속받을때 부모 필드에 동일한 이름의 필드가 있다면
		//어떤 부모의 필드인지 알 수가 없다 이를 모호성이라 한다.
		//부모 클래스 ClassA의 메소드와 인터페이스 InterA의 디폴트 메소드의 이름이 같다.
		//부모 클래스가 이용된다.
		new ClassB().printData();
	}
}
