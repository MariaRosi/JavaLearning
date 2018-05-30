package threads;

class ThreadYield extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("child thread");
			Thread.yield();
		}
	}
}

public class YieldExample {

	public static void main(String[] args) {
		Thread t = new ThreadYield();
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("main thread");
		}
	}
}
