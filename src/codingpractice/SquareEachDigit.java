/*
 * 8 = 64
 * 36 + 16 = 52
 * 25 + 4 =29
 * 4 + 81 = 85
 * 64 + 25 = 89
 * 64 + 81 =145
 * 1+16+25 = 42
 * 16+ 4 =20
 * 4 + 0 =4
 * 
 */

package codingpractice;

public class SquareEachDigit {

	public static void main(String[] args) {
		int number =13;
		int remainder;
		int iSum = 0;
		
		System.out.println("Initial Number = " + number);
		
		while(number != 0) {
			if(number < 10 ) {
				number = number*number; //64 //36
				System.out.println("****111****** = " + number);

			}
			
			number = number + iSum; //52
			
			if(number > 10) { //36
				remainder = number % 10;//4
				iSum  = iSum + remainder*remainder;//16
				number = number/10;//6
			}
			
			if(number == 0) {
				break;
			} else if (number <= 4) {
				break;
			}
	
			
		}
		
		System.out.println(number);

	}

}
