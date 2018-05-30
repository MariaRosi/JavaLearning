/*
 *    1
 *   1 2
 *  1 2 3
 * 1 2 3 4
 */

package codingpractice.pattern;

import java.util.Scanner;
/*
 *    # 
 *   # # 
 *  # # # 
 * # # # # 	
 * 
 * 
 * 
 * 
 */

public class Pattern4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int iNumber = sc.nextInt();

		for (int i = 1; i <= iNumber; i++) {

			for (int k = iNumber-1; k >= i; k--) {
				
				System.out.print(" ");//one space
			}
				
				for (int j = 1; j <= i; j++) {
					System.out.print("# ");
				}

				System.out.println("");

		}

		sc.close();

	}

}
