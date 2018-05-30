package collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapWithComparator {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> tm = new TreeMap<>(new myComparator()); // For default constructor ascending order sorting will be there
		tm.put("ZZZ", 10);
		tm.put("AAA", 30);
		tm.put("SSS", 20);
		tm.put("MMM", 50);
		tm.put("BBB", 20);
		
		System.out.println(tm);

	}

}

class myComparator implements Comparator<Object> {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1); //Descending order sorting
	}
	
}
