package codingpractice.fibonacci;

import java.util.Scanner;

public class FibonacciSeriesRecursion {

	static int iFirst = 0;
	static int iSec = 1;
	static int iTemp = 0;
	static int iEnteredNo = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number");

		int iNumber = sc.nextInt();

		iEnteredNo =  iNumber;
		
		System.out.print(iFirst + " " + iSec + " ");

		printFibonacci(iNumber - 2);// as 2 numbers already printed
		
		sc.close();
	}

	private static void printFibonacci(int iNumber) {
		while (iNumber > 0) {
			iTemp = iFirst + iSec;
			
			if(iTemp >= iEnteredNo){
				break;
			}
			
			System.out.print(iTemp + " ");

			iFirst = iSec;
			iSec = iTemp;
			
			printFibonacci(iNumber - 1);
		}

	}

}
