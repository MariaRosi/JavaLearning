package concurrent.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ConcurrentModificationExceptionExample extends Thread{

	static List<Integer> list = new ArrayList<>();
	
	@Override
	public void run() {
		System.out.println("Child Thread is going to sleep");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Child Thread is adding into the list");
		list.add(40);//java.util.ConcurrentModificationException
	}
	
	
	public static void main(String[] args) {
		int iTemp;
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		ConcurrentModificationExceptionExample t = new ConcurrentModificationExceptionExample();
		t.start();
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			iTemp = (Integer)itr.next();
			System.out.println("Main Thread is iterating the list " + iTemp);
			System.out.println("Main Thread is going to sleep");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
