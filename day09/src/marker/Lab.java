package marker;

public class Lab {
	// 동물을 받아와서 초식동물, 육식동물인지, 잡식동물인지 구분하는 메소드
	// instanceof를 사용한다
	// Animal타입의 배열에 담긴 클래스들 판단하기
	// Animal클래스는 모든 동물의 부모 클래스이므로, up casting할 수 있다.
	public void checkKind(Animal[] animals) {
		// 외부에서 Animal 타입의 배열을 전달받고
		// 각 동물을 가져와야 하기 때문에 반복문을 사용
		for (int i = 0; i < animals.length; i++) {
			// 각 동물을 인덱스번호로 가져와서 초식타입인지 instanceof로 비교한다
			if (animals[i] instanceof Herbivore) {
				System.out.println("Herbivore");
				// 각 동물을 인덱스번호로 가져와서 육식타입인지 instanceof로 비교한다
			} else if (animals[i] instanceof Carbivore) {
				System.out.println("Carbivore");
				// 만약 인덱스로 가져온 동물이 육식동물도 아니고 초식동물도 아니면 잡식 동물로 판단한다.
			} else {
				System.out.println("Omnivore");
			}
		}
	}

	public static void main(String[] args) {

		Animal[] animals = { new Bear(), new Cow(), new Dog(), new Tiger() };
		new Lab().checkKind(animals);

	}
}
