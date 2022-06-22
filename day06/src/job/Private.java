package job;

import java.util.Random;

public class Private implements JobType{
	
	public User user;
	
	public Private(User user) {
		this.user = user;
	}

	public void income() {
		user.money += 10000;
		user.choiceJob();
	}

	public boolean plunder() {
		
		int[] arData = new int[10];
		int rating = 100;
		Random r = new Random();

		for (int i = 0; i < rating / 10; i++) {
			arData[i] = 1;
		}

		if (arData[r.nextInt(10)] == 1) {
			user.money += 100000;
		} else {
			user.money = 0;
		}
		
		if(user.money == 0) {
			return false;
		}
		
		user.choiceJob();
		return true;
	}

	public void telType() {
		System.out.println("귀하의 직업은 private 입니다.");
	}
	
		
}
