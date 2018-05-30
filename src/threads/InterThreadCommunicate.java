package threads;

class ThreadA extends Thread {
	int total;

	public void run() {

		for (int i = 1; i <= 100; i++) {
			total = total + i;
		}

		synchronized (this) {
			this.notify();// after completion operation notification is sent
		}

	}
}

public class InterThreadCommunicate {

	public static void main(String[] args) throws Exception {

		ThreadA threadA = new ThreadA();

		threadA.start();

		// Thread.sleep(10000); //Not Recommended
		synchronized (threadA) {
			threadA.wait(); // The main thread will enter into waiting state and waits for notification from
							// the child thread
		}
		System.out.println(threadA.total);

	}

}
