package threads;

class DisplayNames {

	public void wishName(String sName) throws Exception {

		//Regular output with same DisplayNames object for both the threads , but irregular for different DisplayNames objects
		//Object level lock
		//synchronized (this) {
		//Regular output with Class level lock
		synchronized (DisplayNames.class) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Welcome :");
				Thread.sleep(2000);
				System.out.println(sName);
			}
		}
	}
}

class ThreadClass1 extends Thread {

	DisplayNames d;
	String sName;

	public ThreadClass1(DisplayNames d, String sName) {
		this.d = d;
		this.sName = sName;
	}

	@Override
	public void run() {
		try {
			d.wishName(sName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

public class SynchronizedBlockExample {

	public static void main(String[] args) {

		DisplayNames d1 = new DisplayNames();
		DisplayNames d2 = new DisplayNames();

		ThreadClass1 t1 = new ThreadClass1(d1, "Sourav");
		ThreadClass1 t2 = new ThreadClass1(d2, "Sachin");

		t1.start();
		t2.start();

	}

}
