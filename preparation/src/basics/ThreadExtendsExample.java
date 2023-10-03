package basics;

public class ThreadExtendsExample extends Thread {
//	@Override
//	public void run() {
//		System.out.println("Hello");
//	}
//
//	public static void main(String[] args) {
//		ThreadExtendsExample t = new ThreadExtendsExample();
//		t.start();
//	}
	@Override
	public void run() {
		synchronized (ThreadImplementsExample.class) {
			System.out.println("Thread is running");
			try {
				ThreadImplementsExample.class.wait(2000); // wait() only used in synchronized block//time in mS
				System.out.println("Hello");
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadImplementsExample t1 = new ThreadImplementsExample();
		Thread t = new Thread(t1);
		t.start();
		sleep(5000);
//		synchronized (t) {  
//			t.notify(); //notify() only used in synchronized block
//		}
		System.out.println("Hi");
	}
}
