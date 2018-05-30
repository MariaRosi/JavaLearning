//153 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

package codingpractice.numbers;

import java.util.Scanner;

public class CheckAmstrongNumber {

	public static void main(String[] args) {

		int iRemaining;
		int iSum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int iNumber = sc.nextInt();
		
		int iTemp = iNumber;
		
		
		while(iNumber > 0) {
			iRemaining = iNumber%10;
			iSum = iSum + iRemaining*iRemaining*iRemaining;
			iNumber = iNumber/10;
		}
		
		if(iTemp == iSum) {
			System.out.println("Amstrong Number");
		} else {
			System.out.println("Non Amstrong Number");
		}
		
		sc.close();
	}

}
