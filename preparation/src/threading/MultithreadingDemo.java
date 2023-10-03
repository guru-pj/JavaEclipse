package threading;

//Java code for thread creation by extending the Thread class
class MultithreadingDemo extends Thread {
	public void run() {

		// Displaying the thread that is running
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");

	}
}
