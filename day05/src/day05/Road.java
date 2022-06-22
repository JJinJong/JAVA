package day05;

class Car{
	//전역변수
	//인스턴스 변수
	//클래스 안에서 구체화 시키는 변수들이니깐 인스턴스 변수라고도 부름 그러면 지역변수는?
	String brand;
	String color;
	int price;
	//이 영역 안에서만 사용가능
	public Car(/*매개 변수*/String brand, String color, int price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Car(int price){
		this.price = price;
	}
	
	//alt + shift + s + o
	
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
 
	
	void add(int num1, int num2) {
		
	}


	void add(int num1, double num2) {
		
	}
	void add(int num1, int num2, int num3) {
		
	}
	void add(String str1, String str2) {
		
	}
	
	void engineStart() {
		//여기서 brand를 선언 안했지만 brand는 전역변수라 사용 가능
		//지역변수 다른 영역에서 사용 불가
		int data = 10;		/*접근한 객체가 갖고있는 주소값 this에*/
//		System.out.println(this);
		System.out.println(this.brand+"시동 켜기");
	}
	
	void engineStop() {
		System.out.println(this.brand+"시동 끄기");
	}								/*얘는 생략 가능 이 메소드 안에 전역변수랑 같은애가 없으니깐*/
	
	
}

public class Road {
	public static void main(String[] args) {
		Car momCar = new Car("Benz","Black",10_000);
		Car dadyCar = new Car("BMW", "Blue", 8_000);
		Car myCar = new Car(600);
		
		//객체화 할때 각 객체의 주소를 this가 받고 그 주소를 메소드에 넘겨줘서 필드가 실행됨
		momCar.engineStart();
		dadyCar.engineStart();
		
//		System.out.println(momCar);
//		System.out.println(dadyCar);
//		System.out.println(myCar);
		
		
		
	}
}
