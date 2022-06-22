package bankTset;

import java.util.Random;
import java.util.Scanner;
public class Atm {
	int passwordcnt;

	public static void main(String[] args) {
		Bank b = new Bank();
		Bank c = new Shinhan();
		Atm a = new Atm();
		
		int bankchoice = 0, functionchoice = 0;
		String bankMenu = "1.신한은행\n" + "2.국민은행\n" + "3.농협은행\n" + "4.나가기";
		String functionMenu = "1.계좌개설\n" + "2.입금하기\n" + "3.출금하기\n" + "4.잔액조회\n" + "5.계좌번호찾기\n" + "6.계좌내역확인\n" + "7.나가기";

		Scanner sc = new Scanner(System.in);
		// 메뉴 선택
		while (true) {
			Bank bank = null;
			int incomenum = 0;
			
			//null로 만드니깐 null이 출력되네
			String name = "";
			String pohonenum = "";
			String password = "";
			String accountnum = "";
			System.out.println(bankMenu);
			bankchoice = sc.nextInt();
			// 은행 선택 나가기
			if (bankchoice == 4) {
				break;
			}
			while (true) {
//				System.out.println(passwordcnt+"1");
				System.out.println(functionMenu);
				functionchoice = sc.nextInt();
				//Q.아니 왜 passwordcnt가 5인데 안나가져?
				//아 전역변수로 만드니깐 되네
				if (functionchoice == 7|| a.passwordcnt == 5) {
					break;
				}
//				System.out.println(passwordcnt+"2");
				switch (functionchoice) {
				// 신한 선택 경우
				case 1:
					System.out.println("이름을 입력 해주세요");
					name = sc.next();
					System.out.println("핸드폰 번호를 입력해주세요");
					String phonenum = sc.next();
					System.out.println("비밀번호를 입력해주세요");
					password = sc.next();
					b.accountJoin(bankchoice, name, phonenum, password);
//					System.out.println("잔액 체크"+bank.balance); 왜 여기선 null exception이 뜨지?
					break;
					
				case 2:
					a.passwordcnt = 0;
					while (true) {
						System.out.println("계좌번호를 입력해주세요");
						name = sc.next();
						System.out.println("비밀번호를 입력해주세요");
						password = sc.next();
						bank = b.login(bankchoice, name, password);
						//Q.왜 요놈 넣으니깐 노란줄이 뜨는거지? 
						
						if (bank != null) {
							System.out.println("로그인별 계좌"+bank.accountnum);
							System.out.println("입금할 계좌번호를 입력해주세요");
							accountnum = sc.next();
							System.out.println("입금할 금액을 입력해주세요");
							incomenum = sc.nextInt();
							bank.income(bankchoice, accountnum, incomenum);
							System.out.printf("현재 잔액은 :" + bank.balance + "원 입니다.");
							System.out.println("test 계좌,"+bank.accountnum);
							break;
						}
						a.passwordcnt++;
						if (a.passwordcnt != 5) {
							System.out.println(a.passwordcnt + "회 이름 또는 비밀번호를 잘못 입력하였습니다.");
						} else {
							System.out.println("5회 오류가 났습니다. 은행 업무처에서 문의해주시기 바랍니다.");
							break;
						}
					}
					break;
				case 3:
					break;
				case 4:
					a.passwordcnt = 0;
					while (true) {
						System.out.println("이름을 입력 해주세요");
						name = sc.next();
						System.out.println("비밀번호를 입력해주세요");
						password = sc.next();
						bank = b.login(bankchoice, name, password);
						
						if (bank != null) {
							System.out.println("계좌 번호를 입력해주세요");
							accountnum = sc.next();
							bank = b.accountlogin(bankchoice, accountnum);
							//아 여기서 bank를 바꿔야 했네
							System.out.println("현재 잔액은 : "+bank.balance+"입니다.");
							System.out.println("계좌번호"+bank.accountnum);
							break;
						} else {
							a.passwordcnt++;
							if (a.passwordcnt != 5) {
								System.out.println(a.passwordcnt + "회 이름 또는 비밀번호를 잘못 입력하였습니다.");
							} else {
								System.out.println("5회 오류가 났습니다. 은행 업무처에서 문의해주시기 바랍니다.");
							}

						}
					}
					break;
				case 5:
					break;
				case 6:
					break;
				}
			}
		}

		
		
		
	}
}
