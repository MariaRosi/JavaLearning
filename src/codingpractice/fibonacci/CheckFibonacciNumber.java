package codingpractice.fibonacci;

import java.util.Scanner;

public class CheckFibonacciNumber {

	public static void main(String[] args) {
		int iFirst = 0;
		int iSec = 1;
		int iTemp = 0;
		boolean isFibonacci = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check");
		int iNumber = sc.nextInt();
		
		if(iNumber == 0) {
			isFibonacci = true;
			System.out.println("This is a Fibonacci Number");
		}
		while(iTemp<=iNumber) {
			iTemp = iFirst + iSec;
			if(iTemp == iNumber) {
				System.out.println("This is a Fibonacci Number");
				isFibonacci = true;
				break;
			}
			
			iFirst = iSec;
			iSec = iTemp;
		}
		
		if(!isFibonacci) {
			System.out.println("This is not a Fibonacci Number");
		}
		sc.close();
	}

}
