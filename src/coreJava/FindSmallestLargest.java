package coreJava;

import java.util.Arrays;

public class FindSmallestLargest {

	public static void main(String[] args) {

		int arrayInt[] = { 10, 46, -67, 90, 2, 1, -9, 67, 908 };

		int iSmallest = arrayInt[0];
		int iLargest = arrayInt[0];

		for (int i = 1; i < arrayInt.length; i++) {

			if (arrayInt[i] > iLargest) {
				iLargest = arrayInt[i];

			} else if(arrayInt[i] < iSmallest) {
				iSmallest = arrayInt[i];
			}

		}

		System.out.println("The numbers are = " + Arrays.toString(arrayInt));
		System.out.println("Largest Number is = " + iLargest);
		System.out.println("Smallest Number is = " + iSmallest);

	}

}
