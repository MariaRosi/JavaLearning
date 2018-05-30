package threads;

class GetAndPrintClass {

	int iNum;
	boolean bValueIsSet = false;

	public synchronized void getiNum() {
		if(!bValueIsSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("getiNum = " + iNum);
		bValueIsSet = false;
		notify();
	}

	public synchronized void setiNum(int iNum) {
		
		if(bValueIsSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("setiNum = " + iNum);
		this.iNum = iNum;
		bValueIsSet = true;
		notify();
	}

}

class Producer implements Runnable {

	GetAndPrintClass obj;
	int iNum = 0;

	Producer(GetAndPrintClass obj) {
		this.obj = obj;

		Thread t1 = new Thread(this, "Producer");

		t1.start();
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			obj.setiNum(iNum++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {

	GetAndPrintClass obj;

	Consumer(GetAndPrintClass obj) {
		this.obj = obj;

		Thread t1 = new Thread(this, "Consumer");

		t1.start();
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			obj.getiNum();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class InterThreadCommunication {

	public static void main(String[] args) {

		GetAndPrintClass obj = new GetAndPrintClass();
		new Producer(obj);
		new Consumer(obj);
	}

}
