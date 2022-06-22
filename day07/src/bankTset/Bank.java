package bankTset;

import java.util.Random;

public class Bank {
	Bank db[][] = new Bank[3][100];
	int shinhancnt = 0;
	int kookmincnt = 0;
	int nonghyubcnt = 0;
	public String name;
	public String accountnum;
	public String phonenum;
	public String password;
	public int balance;

	public Bank() {
	}

	public Bank(String name, String accountnum, String phonenum, String password, int balance) {
		this.name = name;
		this.accountnum = accountnum;
		this.phonenum = phonenum;
		this.password = password;
		this.balance = balance;
	}

	String accountMaking() {
		Random r = new Random();
		String account = "";
		for (int i = 0; i < 6; i++) {
			account += String.valueOf(r.nextInt(10));
		}
		return account;
	}

	Bank login(int bankchoice, String accountnum, String pw) {
		Bank bank = null;

		for (int i = 0; i < db[bankchoice - 1].length; i++) {
			Bank bankUser = db[bankchoice - 1][i];
			if (bankUser == null) {
				continue;
			}
			if (accountnum.equals(bankUser.accountnum) && pw.equals(bankUser.password)) {
				bank = bankUser;
				break;
			}
		}
		return bank;
	}

	Bank accountlogin(int bankchoice, String accountnum) {
		Bank bank = null;

		for (int i = 0; i < db[bankchoice-1].length; i++) {
			Bank bankUser = db[bankchoice-1][i];
			if (bankUser == null) {
				continue;
			}
			if (accountnum.equals(bankUser.accountnum)) {
				bank = bankUser;
				break;
			}
		}
		return bank;
	}

	void accountJoin(int bankchoice, String name, String phonenum, String password) {
		Bank bank = null;

		switch (bankchoice) {
		case 1:
			bank = new Shinhan(name, accountMaking(), phonenum, password, 0);
			db[bankchoice - 1][shinhancnt] = bank;
			shinhancnt++;
			break;
		case 2:
			bank = new Kookmin(name, accountMaking(), phonenum, password, 0);
			db[bankchoice - 1][kookmincnt] = bank;
			kookmincnt++;
			break;
		case 3:
			bank = new NongHyub(name, accountMaking(), phonenum, password, 0);
			db[bankchoice - 1][nonghyubcnt] = bank;
			nonghyubcnt++;
			break;
		}
		System.out.println("계좌가 만들어 졌습니다.\n" + "계좌 번호는 :" + bank.accountnum + "입니다.");

	}

	Bank income(int bankchoice, String accountnum, int incomenum) {
		Bank bank = null;
		for (int i = 0; i < db[bankchoice - 1].length; i++) {
			Bank bankUser = db[bankchoice - 1][i];
			if (bankUser == null) {
				continue;
			}
			if (accountnum.equals(bankUser.accountnum)) {
				bank = bankUser;
//				balance += incomenum;
				bank.balance += incomenum;
				break;
			}
		}
		return bank;
	}

	int excome(int excomenum) {
		balance += excomenum;
		return balance;
	}

}
