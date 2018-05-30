package codingpractice.numbers;

import java.util.Scanner;

//121
//111
//if reverse number equals to actual number
public class CheckPalindromeNumber {

	public static void main(String[] args) {

		int iTemp = 0;
		int iReverse = 0;
		int iRemain = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int iNumber = sc.nextInt();
		
		iTemp = iNumber;
		
		while(iNumber > 0) {
			
			iRemain = iNumber%10;
			iReverse = iReverse*10 + iRemain;
			iNumber = iNumber/10;
		}

		if(iTemp == iReverse ) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Non Palindrome Number");
		}
		
		sc.close();
	}

}
