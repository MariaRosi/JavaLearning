package threads;

public class ThreadClassWithRunnable {

	public static void main(String args[]) {
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());

		t1.start();
		t2.start();
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " value of i = " + i);

		}

	}

}