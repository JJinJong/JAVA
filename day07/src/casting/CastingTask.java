package casting;

import java.util.Scanner;

//넷플릭스
//애니메이션, 영화, 드라마 클래스를 3개 선언한다.
//사용자가 선택한 영상이 애니메이션 이라면 "자막지원" (출력하는메소드) 기능을 사용하고
//영화라면 "4D"기능을 사용하고 (출력하는메소드)
//드라마라면 "굿즈"기능을 사용한다. (출력하는메소드)

class Netplix {

}

class Animaiton extends Netplix {
	void smiprint() {
		System.out.println("자막지원");
	}
}

class Movie extends Netplix {
	void watching() {
		System.out.println("4D");
	}

}

class Drama extends Netplix {
	void goods() {
		System.out.println("굿즈");
	}
}

public class CastingTask {
//위 기능을 구현한 메소드 선언
	   //위 기능을 구현한 메소드 선언
//	   public void check(Video video) {
//	      if(video instanceof Animation) {
//	         Animation ani = (Animation)video;
//	         ani.animate();
//	      }else if(video instanceof Film) {
//	         Film f = (Film)video;
//	         f.playFilm();
//	      }else if(video instanceof Drama) {
//	         Drama d = (Drama)video;
//	         d.sellGoods();
//	      }else {
//	         System.out.println("없는 영화입니다.");
//	      }
//	   }

	public static void main(String[] args) {
		Netplix netplix1 = new Animaiton();
		Netplix netplix2 = new Movie();
		Netplix netplix3 = new Drama();
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 애니메이션\n2. 영화\n3. 드라마 \n4. 나가기");
		choice = sc.nextInt();
		
		while(true) {
			if(choice == 4) {break;}
		switch(choice) {
		case 1:
			if(netplix1 instanceof Animaiton == true) {
			Animaiton	animaiton = (Animaiton)netplix1;
			animaiton.smiprint();
			
			} break; 
			
		case 2:
			if(netplix2 instanceof Movie == true) {
				Movie movie = (Movie)netplix2;
				movie.watching();
			}
			break;
		case 3:
			if(netplix3 instanceof Drama == true) {
				Drama drama = (Drama)netplix3;
				drama.goods();
			}
			break;
		
		} 
		continue;
		}
		
		
		
	}
}
