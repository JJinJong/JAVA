package bankTset;

public class Shinhan extends Bank{

	public Shinhan() {}

	public Shinhan(String name, String accountnum, String phonenum, String password, int balance) {
		super(name, accountnum, phonenum, password, balance);
	}
	
	@Override
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
				bank.balance += incomenum*0.5;
				System.out.println(bank.balance);
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
