package bank;

public class Nonghyub extends Bank {

	public Nonghyub() {
	}

	public Nonghyub(String name, String accountnum, String phonenum, String password, int balance) {
		super(name, accountnum, phonenum, password, balance);
	}

	@Override
	int excome(int num) {
		balance -= num+num * 0.5;
		return balance;
	}

}
