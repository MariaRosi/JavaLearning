package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortListWithComparator {

	public static void main(String args[]) {

		List<Integer> listInt = new ArrayList<>();

		Random r = new Random();

		for (int i = 0; i < 100; i++) {

			listInt.add(r.nextInt(1000));
		}

		// Collections.sort(listInt);
		//
		// IntComp intCom = new IntComp();

		// Collections.sort(listInt, new Comparator<Integer>() {
		//
		// @Override
		// public int compare(Integer i1, Integer i2) {

		// return i1 % 10 > i2 % 10 ? 1 : i1 % 10 < i2 % 10 ? -1 : 0;
		// }
		//
		// });

		Collections.sort(listInt, (i1, i2) -> {

			return i1 % 10 > i2 % 10 ? 1 : i1 % 10 < i2 % 10 ? -1 : 0;

		});

		for (Integer eachInt : listInt) {
			System.out.println(eachInt);
		}

	}

}

// class IntComp implements Comparator<Integer>
// {

// @Override
// public int compare(Integer i1, Integer i2) {

// int diff = 0;
// if(i1%10>i2%10) {
// diff = 1;
// } else if (i1%10<i2%10) {
// diff = -1;
// }
//
// return diff;

// return i1%10>i2%10?1:i1%10<i2%10?-1:0;
// }
// }