package codingpractice.sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int i;
		
		Scanner input = new Scanner(System.in);
		
	     //allow user  input;
        System.out.println("How many numbers do you want to enter?");
        int iLength = input.nextInt();

        int arrNumber[] = new int[iLength];

        System.out.println("Enter the " + iLength + " numbers now.");

        for (i = 0 ; i < iLength; i++ ) {
        	arrNumber[i] = input.nextInt();
        }

        System.out.println("These are the numbers you have entered.");
        printArray(arrNumber);

        input.close();
        
        //sorting
        int arrSortedNumber[] = selectionSort(iLength , arrNumber);
        
        System.out.println("");
        System.out.println("After sorting the numbers");
        //print
        printArray(arrSortedNumber);

	}
	
	
	 private static int[] selectionSort(int iLength, int[] arrNumber) {
		 
			int iTemp;
			int i;
			int j;
			

		return arrNumber;
	}


	public static void printArray(int arr[]){
	        for (int each : arr) {
	            System.out.print(each + " ");
	        }
	    }

}
