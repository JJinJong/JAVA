package day05;

import java.util.Scanner;

class SuperCar {
	String brand;
	String color;
	int price;
	String pw = "0000";
	boolean check;
	int policeCount;

//초기 비밀번호 사용 하겠다는거 0000
	public SuperCar(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

//초기 비밀번호 새로 설정
	public SuperCar(String brand, String color, int price, String pw) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.pw = pw;
	}

	// 심화
	// 시동을 켜기 위해서는 비밀번호 4자리 입력
	// 입력한 비밀번호가 3회 연속 실패하면 "경찰 출동" 메세지 출력

	boolean checkPw(String pw) {
		// 문자열 비교시 equqls()를 사용
		return this.pw.equals(pw);
	}

	// 시동 켜기 (만약 이미 시동이 켜져있따면 경고 메시지 출력)
	// 시동 끄기 (만약 이미 시동이 꺼져있따면 경고 메시지 출력)

	// 여기서 한번에 비교하면 되지 않을까? => NoNo
	// 마치 회원가입시 아이디 중복검사 해야하는데 아이디에서 검사하는게 아니라
	// 완료에서 한 번에 중복검사하는 것과 같음
//	boolean engineStart(String pw) {
//		if (!check && checkPw(pw)) {
//			check = true;
//			return true;
//		}
//		return false;
//	}

	boolean engineStart() {
		if (!check) {
			return true;
		}
		return false;
	}

	boolean engineStop() {
		if (check) {
			return true;
		}
		return false;
	}

}

public class Shop {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 35_000, "1234");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String pw = null;
		
		while(true) {
			System.out.println("1.시동켜기\n2.시동끄기");
			choice = sc.nextInt();
			if(choice == 1) {
				if(ferrari.engineStart()) {
					System.out.println("비밀 번호 : ");
					pw = sc.next();
					
					if(ferrari.checkPw(pw)) {
						ferrari.check = true;
						//이게 없으면 누적 되서 비밀번호 맞춰도 다음번에 틀리면 경찰 출동함
						//따라서 매번 성공마다 카운트 0으로 초기화
						ferrari.policeCount = 0;
						System.out.println("시동 켜짐");
					}else {
						ferrari.policeCount++;
						System.out.println("비밀번호"+ferrari.policeCount+"회 오류");
						if(ferrari.policeCount == 3) {
							System.out.println("경찰출동");
							break;
						}
					}
					
					
				}else {
					System.out.println("시동이 이미 켜졌습니다.");
				}
				
			}else if(choice == 2) {
				if(ferrari.engineStop()) {
					ferrari.check = false;
					System.out.println("시동 꺼짐");
				}else {
					System.out.println("시동이 이미 꺼져있습니다.");
				}
			}
		}
		
//		 ferrari.engineStop();
//		 ferrari.engineStart();
//		 if(ferrari.engineStart()) {
//			 System.out.println("시동 킴");
//		 }else {
//			 System.out.println("이미 시동이 켜져있습니다.");
//		 }
//		 
//		 if(ferrari.engineStop()) {
//			 System.out.println("시동 끔");
//		 }else {
//			 System.out.println("이미 시동이 꺼졌습니다.");
//		 }
//		 

	}

}
