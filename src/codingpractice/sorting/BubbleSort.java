package codingpractice.sorting;

import java.util.Scanner;

public class BubbleSort {

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
        int arrSortedNumber[] = bubbleSort(iLength , arrNumber);
        
        System.out.println("");
        System.out.println("After sorting the numbers");
        //print
        printArray(arrSortedNumber);

	}
	
	
	 private static int[] bubbleSort(int iLength, int[] arrNumber) {
		 
			int iTemp;
			int i;
			int j;
			
			boolean isSorted = true; //used for if any array is already sorted then after one pass no need to check further
			
	        for(i=1; i<iLength; i++) { //for pass
	        	for(j=1; j<=iLength-i; j++) { //for iteration //using iLength - i as for each iteration the last 
	        									//and last-1 number so on will be sorted
	        		if(arrNumber[j-1] > arrNumber[j]) { //swap
	        			iTemp = arrNumber[j-1];
	        			arrNumber[j-1] = arrNumber[j];
	        			arrNumber[j] = iTemp;
	        			
	        			isSorted = false;
	        		}
	        	}
	        	
	        	if(isSorted) {
	        		System.out.println("");
	        		System.out.println("Array is already sorted");
	        		break;
	        	}
	        }
		return arrNumber;
	}


	public static void printArray(int arr[]){
	        for (int each : arr) {
	            System.out.print(each + " ");
	        }
	    }

}
