package thread.threadtest2;

public class ThreadTest {
	public static void main(String[] args) {
		ThreadTask t1 = new ThreadTask();
		
		t1.printFirst(() -> {
			for (int i = 0; i < 10; i++) {
				// 쓰레드에 접근한 객체 current
				System.out.println("1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					;
				}
			}
		});
		
		t1.printSecond(() -> {
			for (int i = 0; i < 10; i++) {
				// 쓰레드에 접근한 객체 current
				System.out.println("2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					;
				}
			}
		});
		
		
	}
}
