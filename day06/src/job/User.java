package job;

public class User {
	
	public int money;
	public String name;
	public JobType job = new Private(this);
	
	public User(String name) {
		this.name = name;
	}

	public void choiceJob() {
		if(money < 1000000) {
			job = new Private(this);
		}else if(money >= 1000000) {
			job = new Captain(this);
		}
	}
	
}
