package threads;

public class PriorityCheck {

	public static void main(String[] args) {
	
		System.out.println("Priority of main thread = "+Thread.currentThread().getPriority());
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("child thread");
				}
			}
		});
		
		t.setPriority(10);
		
		System.out.println("Priority of child thread = "+t.getPriority());
		
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("main thread");
		}

	}

}
