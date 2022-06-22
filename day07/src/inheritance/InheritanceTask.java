package inheritance;
//자동차 클래스

//브랜드, 색상, 가격
//- 열쇠로 시동 킴
//- 열쇠로 시동 끔
//슈퍼카 클래스
//브랜드, 색상, 가격, 모드
//-열쇠로 시동킴, 음성으로 시동 킴
//-음성으로 시동 끔
//-지붕 열림
//-지붕 닫힘

class Car {
	String brand, color;
	int price;

	public Car() {}

	public Car(String brand, String color, int price) {
		// Object클래스 상속받는거임 그렇게만 알면됨
//		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void engineStart() {
		System.out.println("열쇠로 시동킴");
	}

	void engineStop() {
		System.out.println("열쇠로 시동끔");
	}
}

class SuperCar extends Car {
	String mode;
	
	public SuperCar() {}
	//alt + shift + s -> o -> super(brand, color, porice)+mode
public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}

//	public SuperCar(String brand, String color, int price, String mode) {
//		super(brand, color, price);
//		this.mode = mode;
//	}


	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("음성으로 시동 킴");
	}

	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}

	void OpenCar() {
		System.out.println("지붕 열림");
	}

	void CloseCar() {
		System.out.println("지붕 닫힘");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		Car car = new Car("Tico", "똥색", 10_000_000);
		SuperCar superCar = new SuperCar("BMW", "Black", 100_000_000, "racing");
		superCar.engineStart();
		superCar.engineStop();
		superCar.OpenCar();
		superCar.CloseCar();
	}

}
