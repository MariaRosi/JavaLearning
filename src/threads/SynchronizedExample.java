package threads;

class Display {

	public synchronized void displayNumber() throws Exception {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			Thread.sleep(2000);
		}
	}

	public synchronized void displayChar() throws Exception {
		for (int i = 65; i < 85; i++) {
			System.out.println((char) i);
			
			Thread.sleep(2000);
		}
	}
}

class MyThreadNumber extends Thread {

	Display d;

	public MyThreadNumber(Display d) {
		this.d = d;
	}

	@Override
	public void run() {
		try {
			d.displayNumber();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class MyThreadChar extends Thread {

	Display d;

	public MyThreadChar(Display d) {
		this.d = d;
	}

	@Override
	public void run() {
		try {
			d.displayChar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class SynchronizedExample {

	public static void main(String[] args) {

//		Will get irregular o/p instead of using synchronized keyword
//		Display d1 = new Display();
//		Display d2 = new Display();
//
//		MyThreadNumber t1 = new MyThreadNumber(d1);
//		MyThreadChar t2 = new MyThreadChar(d2);

//		Regular o/p
		Display d = new Display();

		MyThreadNumber t1 = new MyThreadNumber(d);
		MyThreadChar t2 = new MyThreadChar(d);

		t1.start();
		t2.start();

	}

}
