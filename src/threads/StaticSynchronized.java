package threads;

class DisplayWelcome {

	public synchronized void wish(String name) throws Exception {
		for (int i = 0; i < 10; i++) {
			System.out.print("Welcome : ");
		
			Thread.sleep(2000);
			
			System.out.println(name);
		}
	}

}

class MyThreadWish extends Thread {

	DisplayWelcome d;
	String name;

	public MyThreadWish(DisplayWelcome d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			d.wish(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



public class StaticSynchronized {

	public static void main(String[] args) {

		//Will get irregular o/p instead of using synchronized keyword
		DisplayWelcome d1 = new DisplayWelcome();
		DisplayWelcome d2 = new DisplayWelcome();

		MyThreadWish t1 = new MyThreadWish(d1,"Dhoni");
		MyThreadWish t2 = new MyThreadWish(d2,"Sachin");

		t1.start();
		t2.start();

	}

}
