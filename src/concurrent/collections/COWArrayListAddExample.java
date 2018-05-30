package concurrent.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWArrayListAddExample {

	public static void main(String[] args) {

		String sTempValue ;
		
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		Iterator<String> itr = list.iterator();
		
		list.add("E"); //For normal AL ConcurrentModificationException
		
		while(itr.hasNext()) {
			sTempValue = (String)itr.next();
			System.out.println(sTempValue); //A,B,C,D
		}
		System.out.println(list); //[A, B, C, D, E]

	}

}
