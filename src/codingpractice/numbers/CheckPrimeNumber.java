package codingpractice.numbers;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		boolean isPrime = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int iNumber = sc.nextInt();

		for (int i = 2; i <= iNumber / 2; i++) {

			if (iNumber % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			if (iNumber == 0 || iNumber == 1) {
				isPrime = false;
				System.out.println("Not Prime Number");
			} else {
				System.out.println("Prime Number");
			}
		} else {
			System.out.println("Not Prime Number");
		}

		sc.close();
	}

}
