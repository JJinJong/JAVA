package day01;

public class PrintTest2 {
	public static void main(String[] args) {
		
		//제어문자
		//반드시 따옴표 안에서 작성한다.
		
		/*
		 * \n 	:	new line, 줄바꿈, 개행문자
		 * \t 	:	tab, 위 아래 줄 간격 맞춰 띄기
		 * \"	:	"표현
		 * \'	:	'표현
		 * \\	:	\표현
		 */
		//print라 붙어서 나옴
		System.out.print("\"한동석\"");
		System.out.print("20살");
		//"를 입력하고 싶어서 \"를 이용함
		//println이라 자동 줄바뀜
		System.out.println("\"진세종\"");
		System.out.println("20살\n");
		
		System.out.println("진세종");
		System.out.println("\n앞에 줄");
		System.out.print("안띄어짐");
		System.out.print("불어서나옴");
		System.out.println("\n띄어짐");
		System.out.println("\t넌 뭐냐 정체가");
		System.out.println("넌 뭐냐 정체가\t");
		System.out.println("\t넌 뭐냐 정체가\t");
		System.out.println("\t\t넌 뭐냐 정체가\t");
		System.out.println("\t\t\t\t\t한만큼 앞 줄띄기");
		
	}
}
