package bank2;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		//입력 메인에서 실행하기
		Scanner sc = new Scanner(System.in);
		//랜덤 
		Random r = new Random();
		//계속 user가 이용되서 for문 while문 말고 여기에 선언
		Bank user = null;
		//은행 선택
		//1. 1번 은행
		//2. 2번 은행
		//3. 3번 은행
		String msg = "1. 하나은행\n2. 국민은행\n3. 신한은행\n4. 나가기";
		int bankNum = 0;
		//메인 메뉴
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 계좌내역\n7. 은행 선택";
		int choice = 0;
		String account = "";
		int lengthOfAccount = 0;
		String name = null;
		String phone = null;
		String pw = null;
		int money = 0;
		
		//핸드폰 길이 검사
		boolean condition1 = false;
		//핸드폰 문자 검사
		boolean condition2 = false;
		
		while(true) {
			System.out.println(msg);
			//본인의 은행 선택
			bankNum = sc.nextInt();
			if(bankNum == 4) { break; }
			//메뉴 페이지
			while(true) {
				System.out.println(menu);
				choice = sc.nextInt();
				
				//7. 나가기(은행 다시 선택)
				if(choice == 7) { break; }
				
				switch(choice) {
				case 1: //계좌 개설
					//1. 계좌 개설
					//	- 6자리 랜덤 계좌번호 (999999)
					//	- 기존 고객의 계좌번호와 중복이 없는 번호로 개설해야 한다.
					//업캐스팅 Bank타입으로 1차원 배열으로 자식클래스들 객체 생성
					Bank[] arBank = {new Hana(), new Kookmin(), new Shinhan()};
					user = arBank[bankNum - 1];
					
					//일단 무조건 실행해야 하므로 do while로 받음
					do {
						account = "";
						//0~999999까지 랜덤 숫자 받을꺼임
						account += r.nextInt(1000000);
						//6-랜덤으로 받은 수의 길이 ,
						lengthOfAccount = 6 - account.length();
						//6-랜덤으로 받은 수의 길이가 6자리가 아니면
						if (lengthOfAccount != 0) {
							for (int i = 0; i < lengthOfAccount; i++) {
								//앞에 0을 붙여줌 ex) r.nextInt=> 123, account.length=3 따라서 6-3은 3이고
								//for문을 3번 반복하므로 000123계좌 생성
								account = "0" + account;
							}
						}
					//checkAccount메소드를 실행해서 중복검사 여기서 !=null이면 null이 아니면이라는 뜻이고 
					//null이 아니면 checkAcoount에 중복된 고객이 있다는 것 따라서 다시 do while문을 반복
					//마찬가지로 계좌가 000000이 나오면 반복
					//  \\는 또는 이므로 둘중 하나가 나오면 반복
					}while (Bank.checkAccount(account) != null || account.equals("000000"));
					
					System.out.print("예금주 : ");
					name = sc.next();
					
					// - 핸드폰 번호는 숫자만 입력하도록 하고, 문자가 포함되면 안되며, 0~9사이의 정수여야 한다.
					//일단 실행 되야하므로 do while문 사용
					do {
						System.out.println("핸드폰 번호를 입력해주세요.\n예)01012345678");
						phone = sc.next();
						//번호 길이가 11자리인지 판단
						
						//11자리가 아니면 참
						//while을 계속 돌게함
						//11자리면 false 탈출 가능성
						condition1 = phone.length() != 11;
						//번호가 정수인지 판단
						//Pattern, Matcher안쓰고도 간단히 가능함
						condition2 = false;
						
						for (int i = 0; i < phone.length(); i++) {
							int result = phone.charAt(i) - 48;
							//입력한 핸드폰 번호가 정수가 아니면
							if(result < 0 || result > 9) {
								//왜냐하면 정수가 아니니깐 while문이 돌려면 true여야하니깐 이렇게 짠거
								//만약 if문 조건이 안되서 =>정수인 핸드폰 번호면 => condition2 = false가 되고
								// ||나머지 들도 다 false가 뜨면 while 탈출
								condition2 = true;
							}
						}
																	//체크가 != null이면 중복됐다는 뜻 따라서 반복, null이면 false 탈출
					} while(condition1 || condition2 || Bank.checkPhone(phone) != null);
					
					
					// - 비밀번호는 4자리로만 입력하도록 한다.
					do {
						System.out.print("비밀번호 : ");
						pw = sc.next();
						// 4자리 체크
						condition1 = pw.length() != 4;
						// 위와 같이 정수 체크
						condition2 = false;
						
						for (int i = 0; i < pw.length(); i++) {
							int result = pw.charAt(i) - 48;
							if(result < 0 || result > 9) {
								condition2 = true;
							}
						}
					} while(condition1 || condition2);
					
					user.setAccount(account);
					user.setName(name);
					user.setPhone(phone);
					user.setPw(pw);
					user.setBankNum(bankNum);
					
					Bank.banks[bankNum - 1][Bank.arCount[bankNum - 1]] = user;
					
					Bank.arCount[bankNum - 1] ++;
					System.out.println("*************계좌 개설 완료*************");
					System.out.println(name + "님의 계좌번호 : " + account);
					System.out.println("※ 계좌번호는 다시 알려드리기 어렵습니다. 분실 시 계좌번호가 변경되오니 참고해주세요.");
					break;
					
				case 2: // 입금하기
					//2. 입금하기
					//	- 로그인(계좌번호, 비밀번호)
					//	- 계좌를 개설한 은행에서만 입금 가능
					System.out.print("계좌번호 : ");
					account = sc.next();
					System.out.print("비밀번호 : ");
					pw = sc.next();
					
					user = Bank.login(account, pw);
					
					if(user != null) {
						if(user.getBankNum() != bankNum) {
							System.out.println("계좌를 개설한 은행에서만 입금하실 수 있습니다.");
							break;
						}
						System.out.print("입금액 : ");
						money = sc.nextInt();
						
						if(money < 0) {
							System.out.println("음수는 입력하실 수 없습니다.");
							continue;
						}
						
						user.deposit(money);
						System.out.println(user.getName() + "님의 현재 잔액 : " + user.getMoney() + "원");
						user.writeLog(user, money, true);
						break;
					}
					System.out.println("계좌번호 또는 비밀번호를 다시 확인해주세요.");
					break;
				case 3: // 출금하기
					//3. 출금하기
					//	- 로그인(계좌번호, 비밀번호)
					System.out.print("계좌번호 : ");
					account = sc.next();
					System.out.print("비밀번호 : ");
					pw = sc.next();
					
					user = Bank.login(account, pw);
					if(user != null) {
						System.out.print("출금액 : ");
						money = sc.nextInt();
						
						
						if(money < 0) {
							System.out.println("음수는 입력하실 수 없습니다.");
							continue;
						}
						
						//국민은행이라면 수수료를 포함한 금액으로 잔액 검사를 해준다.
						//미리 빼서 음수면 잔액부족으로 검사!
						
						if(user.getMoney() < money*(user.getBankNum() == 2 ? 1.5 : 1.0)) {
							System.out.println("잔액이 부족합니다.");
							continue;
						}
						
						user.withdraw(money);
						System.out.println(user.getName() + "님의 현재 잔액 : " + user.getMoney() + "원");
						user.writeLog(user, money, false);
						break;
					}
					System.out.println("계좌번호 또는 비밀번호를 다시 확인해주세요.");
					break;
				case 4: // 잔액조회
					//4. 잔액조회
					//	- 로그인(계좌번호, 비밀번호)
					System.out.print("계좌번호 : ");
					account = sc.next();
					System.out.print("비밀번호 : ");
					pw = sc.next();
					
					user = Bank.login(account, pw);
					if(user != null) {
						System.out.println(user.getName() + "님의 현재 잔액 : " + user.getBalance() + "원");
						if(user.getMoney() == 0) {
							System.out.println("넌 소중해");
						}
					}else {
						System.out.println("계좌번호 또는 비밀번호를 다시 확인해주세요.");
					}
					break;
				case 5: // 계좌번호 찾기
					//5. 계좌번호 찾기
					//	- 휴대폰 번호, 비밀번호 입력
					//	- 새로운 계좌번호 부여
					System.out.print("핸드폰 번호 : ");
					phone = sc.next();
					user = Bank.checkPhone(phone);
					if(user != null) {
						System.out.print("비밀번호 : ");
						pw = sc.next();
						if(user.getPw().equals(pw)) {
							do {
								account = "";
								account += r.nextInt(1000000);
								lengthOfAccount = 6 - account.length();
								if (lengthOfAccount != 0) {
									for (int i = 0; i < lengthOfAccount; i++) {
										account = "0" + account;
									}
								} 
							}while (Bank.checkAccount(account) != null || account.equals("000000"));
							user.changeLog(user.getAccount(), account);
							user.setAccount(account);
							System.out.println("*************계좌 변경 완료*************");
							System.out.println(name + "님의 계좌번호 : " + account);
							System.out.println("※ 계좌번호는 다시 알려드리기 어렵습니다. 분실 시 계좌번호가 변경되오니 참고해주세요.");
						}else {
							System.out.println("계좌번호 또는 비밀번호를 다시 확인해주세요.");
						}
					}else {
						System.out.println("계좌번호 또는 비밀번호를 다시 확인해주세요.");
					}
					break;
				case 6: // 거래내역
					//선택★ 6. 계좌내역(거래내역) - 연결(+=)
					//	- 계좌번호, 예금주, 입금인지 출금인지, 입금액 또는 출금액, 현재 잔액 출력
					System.out.print("계좌번호 : ");
					account = sc.next();
					System.out.print("비밀번호 : ");
					pw = sc.next();
					
					user = Bank.login(account, pw);
					if(user != null) {
						System.out.println(user.getLog());
					}else {
						System.out.println("계좌번호 또는 비밀번호를 다시 확인해주세요.");
					}
					
					//	- 만약 계좌번호 변경 시 이전 거래 내역에서 계좌번호를 신규 계좌번호로 수정(split())
					break;
				}
			}
		}
	}
}








