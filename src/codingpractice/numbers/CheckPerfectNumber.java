//6 = 1 + 2 + 3 = 6
//28 = 1 + 2 + 4 + 7 + 14 =28
//addition of the factors is same as the number
package codingpractice.numbers;

import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {

		int iSum = 0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int iNumber = sc.nextInt();
		
		for(int i=1 ; i<=iNumber/2; i++ ) {
			if(iNumber%i == 0) {
				iSum = iSum + i;
			}
		}
		
		if(iNumber == iSum) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Non Perfect Number");
		}
			
		sc.close();

	}

}
