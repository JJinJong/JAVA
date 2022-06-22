package bank;

public class Bank {
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

	int income(int num) {
		balance += num;
		return balance;
	}
	
	int excome(int num) {
		if(balance - num < 0) {
			System.out.println("잔액이 부족합니다");
		}else {
		balance -= num;
		}
		return balance;
	}
	
}
