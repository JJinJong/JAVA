package bank2;

public class Hana extends Bank{
	@Override
	public void deposit(int money) {
		money *= 0.5;
		super.deposit(money);
	}
}
