package multiThreading;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <= 5; i++) {
			ThreadExample te = new ThreadExample();
			te.start();
			Thread.sleep(1000);
		}
	}
}
