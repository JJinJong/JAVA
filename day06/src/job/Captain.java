package job;

import java.util.Random;

public class Captain implements JobType{

	public User user;
	
	public Captain(User user) {
		this.user = user;
	}

	public void income() {
		user.money += 10000000;
		user.choiceJob();
	}

	public boolean plunder() {
		
		int[] arData = new int[10];
		int rating = 50;
		Random r = new Random();

		for (int i = 0; i < rating / 10; i++) {
			arData[i] = 1;
		}

		if (arData[r.nextInt(10)] == 1) {
			user.money += 1000000000;
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
		System.out.println("귀하의 직업은 captain입니다.");
	}

	
}
