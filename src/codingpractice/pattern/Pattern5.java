/*
 *    1
 *   1 2
 *  1 2 3
 * 1 2 3 4
 */

package codingpractice.pattern;

import java.util.Scanner;
/*
 * # 
 * # # 
 * # # # 
 * # # # #
 * # # # 	
 * # #
 * #
 */

public class Pattern5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any odd number for level");
		int iNumber = sc.nextInt();

		for (int i = 1; i <= iNumber; i++) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print("# ");
				
				if(i+j > iNumber) {
					break;
				}
			}

			System.out.println("");
		}

		sc.close();

	}

}
