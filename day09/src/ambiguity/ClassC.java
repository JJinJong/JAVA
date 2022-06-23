package ambiguity;

public class ClassC implements InterA, InterB {
	//두 개의 인터페이스 내에 같은 이름과 매개변수의 메소드가 선언 되어 있는 경우
	//자식클래스에서 재정의해서 이용한다.
	@Override
	public void printData() {
		InterA.super.printData();
		//InterB.super.printData(); B를 쓰고싶으면
	}
}
