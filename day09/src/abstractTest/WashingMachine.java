package abstractTest;

public class WashingMachine extends Electronics{
	//추상클래스를 상속받았으므로 추상클래스의 메소드를 강제로 재정의해야한다.
	void on() {
		System.out.println("전원 버튼을 누른다.");
	}

	void off() {
		on();
	}

}
