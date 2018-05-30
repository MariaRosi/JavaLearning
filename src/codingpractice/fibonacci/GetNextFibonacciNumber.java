package codingpractice.fibonacci;

import java.util.Scanner;

public class GetNextFibonacciNumber {

	public static void main(String[] args) {
		int iFirst = 0;
		int iSec = 1;
		int iTemp = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int iNumber = sc.nextInt();
		
		while(iTemp<=iNumber) {
			iTemp = iFirst + iSec;
//			if(iTemp > iNumber) {
//				System.out.println("The next Fibonacci Number = "+iTemp);
//				break;
//			}
			
			iFirst = iSec;
			iSec = iTemp;
		}
		
		System.out.println("The next Fibonacci Number = "+iTemp);
		
		sc.close();

	}

}
