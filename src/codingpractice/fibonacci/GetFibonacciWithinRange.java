package codingpractice.fibonacci;

import java.util.Scanner;

public class GetFibonacciWithinRange {

	public static void main(String[] args) {
		int iFirst = 0;
		int iSec = 1;
		int iTemp = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int iNumber1 = sc.nextInt();
		System.out.println("Enter second number");
		int iNumber2 = sc.nextInt();
		
		if(iNumber1 == 0) {
			System.out.print(iFirst + " " + iSec + " ");
		}

		
		while (iTemp <= iNumber2) {
			iTemp = iFirst + iSec;
			
			if(iTemp >= iNumber2) {
				break;
			}
			
			iFirst = iSec;
			iSec = iTemp;
			
			if(iTemp >= iNumber1) {
				System.out.print(iTemp + " ");
			}
			
		}
		sc.close();	
	}

}
