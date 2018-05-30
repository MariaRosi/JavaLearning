package codingpractice.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int iFirstNumber = 0;
		int iSecNumber = 1;
		int iTemp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		int iMaxNumber = sc.nextInt();
		
		System.out.print(iFirstNumber+" "+iSecNumber+" ");
		
		while(iTemp <= iMaxNumber) {
			
			iTemp = iFirstNumber + iSecNumber;
			
			if(iTemp >= iMaxNumber) {
				break;
			}
			
			System.out.print(iTemp+" ");
			
			iFirstNumber = iSecNumber;
			iSecNumber = iTemp;
			
		}
		
		sc.close();
	}

}
