package concurrent.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConcurrentModifcationExample extends Thread{

	static Map<Integer,String> map = new HashMap<>();
	
		
	@Override
	public void run() {
		System.out.println("Child Thread is going to sleep");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Child Thread is updating the map");
		
		map.put(103, "C");

	}

	public static void main(String[] args) {
		
		map.put(101, "A");
		map.put(102, "B");
		
		ConcurrentModifcationExample t = new ConcurrentModifcationExample();
		t.start();
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		
		for(Entry<Integer, String> entry : entries) {
			System.out.println("Main Thread is iterating the map and current key= "+entry.getKey() + " and value = "+entry.getValue());
			System.out.println("Main Thread is going to sleep");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("The map = "+map);

	}

}
