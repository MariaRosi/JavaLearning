/* 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * 0 1 0 1 0 1
 * 
 */

package codingpractice.pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int iNumber = sc.nextInt();

		for(int i = 1; i<=iNumber; i++ ) {
			
			for(int j = i; j>=1; j-- ) {
				
				if(j%2 != 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
				
			}
			System.out.println("");
		}

		sc.close();
	}

}
