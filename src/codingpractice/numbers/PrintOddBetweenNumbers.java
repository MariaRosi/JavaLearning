package codingpractice.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintOddBetweenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		
		int iFirst = sc.nextInt();
		
		System.out.println("Please enter the first number");
		
		int iSecond = sc.nextInt();
		
		int[] oddNumbers = findOddNumber(iFirst,iSecond);
		
		for(int number : oddNumbers) {
			
			System.out.println(number);
			
		}
		
		sc.close();
	}

	private static int[] findOddNumber(int iFirst, int iSecond) {
		int k = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=iFirst ; i<=iSecond; i++) {
			if(i%2 != 0) {
				list.add(i);
			}
		}

		int[] resultArry = new int[list.size()];
		
		for(int each : list) {
			resultArry[k] = each;
			k++;
		}
		
		return resultArry;

	}

}
