package threads;

class DaemonThread extends Thread{
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Inside Child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class DaemonThreadExample {

	public static void main(String[] args) {
		System.out.println("Main Thread is Daemon = "+Thread.currentThread().isDaemon());
		
		//Thread.currentThread().setDaemon(true);//java.lang.IllegalThreadStateException
		
		DaemonThread t = new DaemonThread();
		
		System.out.println("Child Thread is Daemon Before = "+t.isDaemon());
		
		t.setDaemon(true);//always need to set it before starting the thread
		
		System.out.println("Child Thread is Daemon After = "+t.isDaemon());
		
		t.start();//once main thread(non Daemon) is completed child thread(Daemon) also terminated by default
		
		System.out.println("Main Thread completed");
		
	}

}
