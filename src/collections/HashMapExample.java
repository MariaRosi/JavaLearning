package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		Entry<String, String> everyEntry;
		
		map.put("name", "Rakesh");
		map.put("age", "32");
		map.put("company", "XYZ");
		
		Set<String> keys = map.keySet();
		
		Collection<String> values = map.values();
		
		Set<Map.Entry<String,String>> entries = map.entrySet();
		
		System.out.println("Keys = "+keys);
		System.out.println("Values = "+values);
		System.out.println("Entries = "+entries);
		
		System.out.println("Using Iterator");
		Iterator<Entry<String, String>> itr = entries.iterator();
		
		
		while(itr.hasNext()) {
			everyEntry = itr.next();
			System.out.println("Key : "+everyEntry.getKey()+" and Value : "+everyEntry.getValue());
		}
	
		System.out.println("Using keySet");
		for(String key : keys) {
			System.out.println("key : "+key+" and value : "+map.get(key));
		}
		
		System.out.println("Using entrySet");
		
		for(Map.Entry<String,String> eachEntry : entries) {
			
			System.out.println("Key : "+eachEntry.getKey()+" and Value : "+eachEntry.getValue());
			
		}

	} 

}
