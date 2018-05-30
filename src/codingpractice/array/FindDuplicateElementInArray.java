package codingpractice.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		String arr_Courses[] = { "Java", "C++", "Ruby", "C", "Python", "Ruby", "Java" };

		int iArr_Courses_length = arr_Courses.length;
		int i = 0;
		int j = 0;

		Set<String> setDuplicate1 = new HashSet<String>();

		// 1.Using for loop
		for (i = 0; i < iArr_Courses_length; i++) {
			for (j = i + 1; j < iArr_Courses_length; j++) {

				if (arr_Courses[i].equals(arr_Courses[j])) {

					setDuplicate1.add(arr_Courses[i]);
				}

			}
		}

		System.out.println("Duplicate element is " + setDuplicate1);

		// 2.Using HashSet
		Set<String> setTemp = new HashSet<String>();
		Set<String> setDuplicate2 = new HashSet<String>();

		for (String sCourse : arr_Courses) {

			if (!(setTemp.add(sCourse))) {
				setDuplicate2.add(sCourse);

			}

		}

		System.out.println("Duplicate element is " + setDuplicate2);

		// 3.Using HasMap
		Map<String, String> mapTemp = new HashMap<String, String>();
		Set<String> setDuplicate3 = new HashSet<String>();

		for (String sCourse : arr_Courses) {
			
			if (mapTemp.containsKey(sCourse)) {
				setDuplicate3.add(sCourse);

			} else {
				mapTemp.put(sCourse, "Test");
			}

		}
		
		System.out.println("Duplicate element is " + setDuplicate3);
	}

}
