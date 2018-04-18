package coreJava;

public class ReverseNumber {

	public static void main(String[] args) {
		int iNumber = 54367;
		int iRevNumber = 0;

		while (iNumber != 0) {
			iRevNumber = iRevNumber * 10 + iNumber % 10;
			iNumber = iNumber / 10;

		}
		System.out.println(iRevNumber);
		
		//Using StringBuffer
		int iNumberNext = 65339;
		
		String sNumberNext = String.valueOf(iNumberNext);
		
		StringBuffer sb = new StringBuffer(sNumberNext);
		
		System.out.println(sb.reverse());

	}

}
