package multiThreading;

public class ThreadExample extends Thread {

	public void run() {
		System.out.println("Thread: " + currentThread().getId());
	}
}
