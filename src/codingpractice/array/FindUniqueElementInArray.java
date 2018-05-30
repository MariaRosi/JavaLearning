package codingpractice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindUniqueElementInArray {

	public static void main(String[] args) {

		int arrayInt1[] = {1,2,1,1,2,3,4,2,4,5,2,4,5};
		int arrayInt2[] = {1,2,1,1,2,3,4,2,4,5,2,4,5};
		int arrayInt3[] = {1,2,1,1,2,3,4,2,4,5,2,4,5};
		int arrayInt4[] = {1,2,1,1,2,3,4,2,4,5,2,4,5};
		
		Set<Integer> uniqueElement1 = new HashSet<>();
		Set<Integer> uniqueElement2 = new HashSet<>();
		Set<Integer> uniqueElement3 = new HashSet<>();
		Set<Integer> uniqueElement4 = new HashSet<>();
		
		int iLength = arrayInt1.length;
		
		boolean isDuplicate = false;
		
		//Using for loop
		for(int i=0; i<iLength; i++) {
			//reset
			isDuplicate = false;
			for(int j=0; j<iLength; j++) {
				if((arrayInt1[i] == arrayInt1[j]) && (i != j)) {
					//duplicate found
					isDuplicate = true;
					break;
				}
			}

			if(!isDuplicate) {
				uniqueElement1.add(arrayInt1[i]);
			}
		}
		
		System.out.println(uniqueElement1);
		
		//using sort
		Arrays.sort(arrayInt2);
		for(int i=1; i<iLength-1; i++) {
			if((arrayInt2[i] != arrayInt2[i+1]) && (arrayInt2[i] != arrayInt2[i-1])) {
				//duplicate element
				uniqueElement2.add(arrayInt2[i]);
			}
		}
		
		System.out.println(uniqueElement2);
		
		//using Hashset
		Set<Integer> tempSet = new HashSet<>();
		Set<Integer> duplicateSet = new HashSet<>();
		for(int i=0; i<iLength; i++) {
			
			if(tempSet.contains(arrayInt3[i])) {
				//duplicate element
				duplicateSet.add(arrayInt3[i]);
			} else {
				tempSet.add(arrayInt3[i]);
			}
		}
		
		for(int i=0; i<iLength; i++) {
			if(!(duplicateSet.contains(arrayInt3[i]))) {
				uniqueElement3.add(arrayInt3[i]);
			}
		}
		
		System.out.println(uniqueElement3);
		
		//using HasMap
		Map<Integer,String> map = new HashMap<>();
		
		for(int i=0; i<iLength; i++) {
			if(map.containsKey(arrayInt4[i])) {
				map.put(arrayInt4[i], "Duplicate");
			} else {
				map.put(arrayInt4[i], "Unique");
			}
		}
		
		Set<Map.Entry<Integer,String>> entries = map.entrySet();
		
		for(Map.Entry<Integer,String> eachEntry : entries) {
			if(eachEntry.getValue().equals("Unique")) {
				uniqueElement4.add(eachEntry.getKey());
			}
		}
		
		System.out.println(uniqueElement4);	

	}
	
}
