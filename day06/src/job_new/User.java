package job_new;

public class User {
	
	public String name;
	public int money;
	public Job curJob = new Private(this); // 현재 직업
	public Job preJob; // 전의 직업
	
	public User(String name, int money) {
		this.name = name;
		this.money = money;
		changeJob();
	}
	
	public boolean changeJob() {
		preJob = curJob;
		
		if(money < 100 * 10000) {
			curJob = new Private(this);
		}else if (money >= 100*10000 && money < 1000 * 10000) {
			curJob = new Sergeant(this);
		}else if(money >= 1000 * 10000) {
			curJob = new Captain(this);
		}
		
		if(!preJob.type.equals(curJob.type)) {
			return true;
		}
		
		return false;
	}
	
}
