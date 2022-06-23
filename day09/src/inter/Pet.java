package inter;

public interface Pet {
	final static int eyes = 2 ;
	//int 앞에 final static 생략된거
	//static이라 Pet.eyes로 사용가능 객체화 안해도됨
	int nose = 1 ;
	
	abstract void sitDown();
	//abstract는 생략가능
	void stop();
	void poop();
	void 빵야();
}
