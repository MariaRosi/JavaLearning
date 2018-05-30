package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchAndReverseList {

	public static void main(String[] args) {
		List<String> listInt = new ArrayList<>();
		
		listInt.add("A");
		listInt.add("Z");
		listInt.add("M");
		listInt.add("K");
		listInt.add("a");
		
		System.out.println("Before sorting listInt = " + listInt);
		
		//Collections.sort(listInt); //Default sorting
		
		Collections.sort(listInt,new comparatorOgj());//Custom sorting, [a, Z, M, K, A]
		
		System.out.println("After sorting listInt = " + listInt);
		
		int iResult = Collections.binarySearch(listInt,"M");
		
		System.out.println("The search result of M is = "+iResult);//2 //2
		
		iResult = Collections.binarySearch(listInt,"J");
		
		System.out.println("The search result of J is = "+iResult);//-2 //-1
		
		Collections.reverse(listInt);
		
		System.out.println("After reversing listInt = " + listInt);
		

	}
}

class comparatorOgj implements Comparator<Object> {
	
	@Override
	public int compare(Object o1, Object o2) {
 
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s2.compareTo(s1);
	}
}


