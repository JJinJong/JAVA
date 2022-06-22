package job;

import java.util.Random;

public class Job {
	int age;
	int money;
	String name;
	String grade;

	public Job(int age, int money, String name, String grade) {
		this.age = age;
		this.money = money;
		this.name = name;
		this.grade = grade;
	}

	void changeGrade() {
		if (money < 100000) {
			grade = "private";
		} else if (money > 100000 && money <1000000) {
			grade = "sergeant";
		} else if (money > 1000000) {
			grade = "captain";
		}
	}

	void income() {
		if (grade == "private") {
			money += 10000;
		} else if (grade == "sergeant") {
			money += 100000;
		} else if (grade == "captain") {
			money += 10000000;
		}
		changeGrade();
	}

	boolean plunder() {
		int[] arData = new int[10];
		int rating = 70;
		Random r = new Random();

		for (int i = 0; i < rating / 10; i++) {
			arData[i] = 1;

		}

		if (grade == "private") {

			if (arData[r.nextInt(10)] == 1) {
				money += 100000;
			} else {
				money = 0;
			}
		} else if (grade == "sergeant") {
			if (arData[r.nextInt(10)] == 1) {
				money += 10000000;
			} else {
				money = 0;
			}
		} else if (grade == "captain") {
			if (arData[r.nextInt(10)] == 1) {
				money += 1000000000;
			} else {
				money = 0;
			}
		}

		changeGrade();
		if (money == 0) {
			return false;
		}

		return true;
	}

}
