/*
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */
package codingpractice.pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int iNumber = sc.nextInt();
				
		for(int i=1; i<=iNumber; i++) {

			for(int j=i; j>=1; j--) {
					System.out.print(i + " ");
			}
			
			System.out.println("");
		}

		sc.close();
	}

}
