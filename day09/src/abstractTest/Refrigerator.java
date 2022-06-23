package abstractTest;

public class Refrigerator extends Electronics {
	//추상 클래스를 상속받았으므로 추상클래스의 추상메소드를 강제로 재정의해야한다.
	void on() {
		System.out.println("버튼을 on쪽으로 누른다.");
	}

	void off() {
		System.out.println("버튼을 off쪽으로 누른다.");
	}


}
