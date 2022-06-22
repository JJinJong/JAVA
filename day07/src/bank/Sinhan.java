package bank;

public class Sinhan extends Bank{

	public Sinhan() {}
	
	public Sinhan(String name, String accountnum, String phonenum, String password, int balance) {
		super(name, accountnum, phonenum, password, balance);
	}

	@Override
	int income(int num) {
		balance += num*0.5;
		return balance;
	}
	
	@Override
	int excome(int num) {
		balance -= num;
		return balance;
	}
	
}
