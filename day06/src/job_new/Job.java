package job_new;

import java.util.Random;

public abstract class Job {
	
	public User user;
	public String type;
	public int reward;

	public Job(User user) {
		this.user = user;
	}
	
	public void income() {
		user.money += reward;
	};
	
	public boolean plunder() {
		
		int[] arData = new int[10];
		int rating = 90;
		Random r = new Random();

		for (int i = 0; i < rating / 10; i++) {
			arData[i] = 1;
		}

		if (arData[r.nextInt(10)] == 1) {
			user.money += reward * 10;
		} else {
			user.money = 0;
		}
		
		if(user.money == 0) {
			return false;
		}
		
		return true;
	};
	
}
