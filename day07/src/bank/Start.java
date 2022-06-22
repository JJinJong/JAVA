package bank;
//for while switch 에서만 break;를 쓴다 
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {
	//db
	static Bank[][] db = new Bank[3][100];
	int sinhanNum = 0;
	int nonghyubNum = 0;
	int kookminNum = 0;
	static Scanner sc = new Scanner(System.in);
	//계좌번호 생성 메소드
	String accountMaking() {
		String account = "";
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			account += String.valueOf(r.nextInt(10));
		}
		//계좌 번호 중복체크
		for (int i = 0; i < db.length; i++) {
			for (int j = 0; j < db[i].length; j++) {
				Bank bankUser = db[i][j];
				if(bankUser == null) {continue;}
				if(account.equals(bankUser.accountnum)) {
					account = accountMaking();
					break;
				}
			}
		}
		return account;
	}
	// String name, int accountnum, int phonenum, String password, int balance

	//로그인 메소드
	static Bank login (int bankchoice) {
		Bank bank = null;
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String pw = sc.next();
		
		for (int i = 0; i < db[bankchoice - 1].length; i++) {
			Bank bankUser = db[bankchoice -1][i];
			if(bankUser == null) {continue;}
			//이름과 패스워드 검사
			if(name.equals(bankUser.name) && pw.equals(bankUser.password)) {
				bank = bankUser;
				break;
			}
		}
		
		return bank;
	}
	//잔액조회 메소드
	static Bank login_for_account (int bankchoice) {
		Bank bank = null;
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String pw = sc.next();
		System.out.println("핸드폰번호를 입력해주세요");
		String phoneNum = sc.next();
		
		for (int i = 0; i < db[bankchoice - 1].length; i++) {
			Bank bankUser = db[bankchoice -1][i];
			if(bankUser == null) {continue;}
			if(name.equals(bankUser.name) && pw.equals(bankUser.password) && phoneNum.equals(bankUser.phonenum)) {
				bank = bankUser;
				break;
			}
		}
		
		return bank;
	}
	
	//계좌 개설 메소드
	void accountJoin(int bankchoice) {

		Bank bank = null;

		System.out.println("본인의 이름을 적어주세요");
		String accountname = sc.next();
		
		String phonenum = null;
		while(true) {
			System.out.println("본인의 핸드폰 번호를 적어주세요");
			phonenum = sc.next();
			//휴대폰 번호 정규식 자바
			//문자열 형식 검증하는 기능?함수? 형식 \\d{3}- 3자리 번호 입력하고 -붙이라는 뜻      정규식은 느리다
			Pattern pattern = Pattern.compile("\\d{3}\\d{4}\\d{4}");
			//Matcher는 올바르게 썼는지 참 거짓
			Matcher matcher = pattern.matcher(phonenum);
			
			//Matcher값 true false로 받아서 검사 참이면 빠져나오고 false면 계속 반복
			if(!matcher.matches()) {
				System.out.println("휴대폰 번호를 잘못 입력하였습니다");
				continue;
			}
			//휴대번호 중복 체크
			boolean check = true;
			for (int j = 0; j < db[bankchoice-1].length; j++) {
				Bank bankUser = db[bankchoice -1][j];
				if(bankUser == null) {continue;}
				if(phonenum.equals(bankUser.phonenum)){
					check = false;
					break;
				}
			}
			
			if(check) {
				break;
			}else {
				System.out.println("핸드폰 번호가 중복되었습니다.");
			}
		}
		//비밀번호 입력
		String password = null;
		while(true) {
			System.out.println("비밀번호 4자리를 입력해주세요\nex)4354");
			password = sc.next();
			//비밀번호 4자리 체크
			if(password.length() != 4) {
				System.out.println("4자리가 아닙니다.");
				continue;
			}else {
			break;
			}
		}
		//선택한 은행에 따라서 회원 생성
		if (bankchoice == 1) {
			bank = new Sinhan(accountname, accountMaking(), phonenum, password, 0);
			db[bankchoice - 1][sinhanNum] = bank;
			sinhanNum++;
		} else if (bankchoice == 2) {
			bank = new Nonghyub(accountname, accountMaking(), phonenum, password, 0);
			db[bankchoice - 1][nonghyubNum] = bank;
			nonghyubNum++;
		} else if (bankchoice == 3) {
			bank = new Kookmin(accountname, accountMaking(), phonenum, password, 0);
			db[bankchoice - 1][kookminNum] = bank;
			kookminNum++;
		}

		System.out.println("계좌가 만들어 졌습니다");
	}

	public static void main(String[] args) {
		Start start = new Start();

		String bankMenu = "1.신한\n2.농협\n3.국민\n4.나가기";
		String functionMenu = "1.계좌개설\n2.입금하기\n3.출금하기\n4.잔액조회\n5.계좌번호찾기\n6.이력조회\n7.나가기";
		int bankchoice = 0;
		int functionchoice = 0;
		int incomenum = 0;
		int excomnum = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(bankMenu);
			bankchoice = sc.nextInt();
			if (bankchoice == 4) {
				break;
			}
			//어차피 bankchoice에 따라 분기가 갈리는게 아니니깐 입력만 받고
			//fucntionMenu나오게 하면 되겠네 다시 만들땐 고려해서 만들기
			while (true) {
				switch (bankchoice) {
				case 1:
					while (true) {
						System.out.println(functionMenu);
						functionchoice = sc.nextInt();
						if (functionchoice == 7) {
							break;
						}

						switch (functionchoice) {
						case 1:
							start.accountJoin(bankchoice);
							break;

						case 2:
							int cnt =0;
							while(true) {
								
								Bank bank = login(bankchoice);
								
								if(bank != null) {
									System.out.println("입금할 금액을 입력해주세요");
									incomenum = sc.nextInt();
									bank.income(incomenum);
									System.out.println("입금 후 잔액 : "+ bank.balance);
									break;
								}else {
									cnt++;
									System.out.println("정보가 틀렸습니다. 다시입력해주세요.\n"+cnt+"회 오류");
								}
							}
							
							break;

						case 3:
							
							Bank bank = login(bankchoice);
						
							if(bank != null) {
								System.out.println("출금할 금액을 입력해주세요");
								excomnum = sc.nextInt();
								
								bank.excome(excomnum);
								System.out.println("출금 후 잔액 : "+ bank.balance);
							}else {
								System.out.println("이름 또는 비밀번호를 잘못 입력하였습니다");
							}
							break;
							
						case 4:
							Bank bank2 = login(bankchoice);
							
							if(bank2 != null) {
								System.out.println("현재 잔액은 : "+bank2.balance);
							}else {
								System.out.println("이름 또는 비밀번호를 잘못 입력하였습니다");
							}
							break;
							
						case 5:
							Bank bank3 = login_for_account(bankchoice);
							if(bank3 != null) {
								bank3.accountnum = start.accountMaking();
								System.out.println("새로운 계좌번호는 : "+bank3.accountnum);
							}else {
								System.out.println("이름 또는 비밀번호 또는 핸든폰 번호를 잘못 입력하였습니다");
							}
							
							break;

						case 6:
							break;
						}
					}
					break;

				case 2:
					break;
				case 3:
					break;
				}
			}

		}

	}
}
