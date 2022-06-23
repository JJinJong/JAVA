package threadTest1;

public class ThreadTest{
	public static void main(String[] args) {
		Thread1[] t1 = {
				new Thread1("음메~"), 
				new Thread1("꿀@꿀@"), 
				new Thread1("Grrrr!!")
		};
		
		for (int i = 0; i < t1.length-1; i++) {
			t1[i].start();
		}
		
		try {
			t1[0].join();
			t1[1].join();
		} catch (InterruptedException e) {;}
		
		t1[2].start();
	}
}
