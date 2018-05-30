package threads;

public class ThreadClass {

	public static void main(String[] args) {

		MyThreadClass t1 = new MyThreadClass();
		MyThreadClass t2 = new MyThreadClass();
		
		t1.start();
		t2.start();

	}

}


class MyThreadClass extends Thread{

	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println(Thread.currentThread().getName() + " value of i = "+i);
			
		}

	}
	
}