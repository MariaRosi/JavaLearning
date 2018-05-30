package codingpractice.fibonacci;

import java.util.Scanner;

public class GetPreviousFibonacciNumber {

	public static void main(String[] args) {
		int iFirst = 0;
		int iSec = 1;
		int iTemp = 0;
		int iTempPrevious = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int iNumber = sc.nextInt();
		
		while(iTemp < iNumber) {
			iTempPrevious = iTemp;
			iTemp = iFirst + iSec;
			
			if(iTemp >= iNumber) {
				System.out.println("The previous Fibonacci Number = "+iTempPrevious);
				break;
			}
			
			iFirst = iSec;
			iSec = iTemp;
		}
		
		sc.close();
	}

}
