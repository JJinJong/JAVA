package thread.threadtest2;

public class Thread1 {
	
	public static void repeat() {
		for (int i = 0; i < 10; i++) {
			// 쓰레드에 접근한 객체 current
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {repeat();}, "first");
		Thread t2 = new Thread(() -> {repeat();}, "second");
		Thread t3 = new Thread(() -> {repeat();}, "third");
		
		try {
			t1.start();
			t2.start();
			t3.start();
			
			t1.join();
			t3.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
