package codingpractice.reverse;

public class ReverseString {
	
	static String sRev = "";

	public static void main(String[] args) {

		String sTemp = "Hello World";

		String sRev = "";

		// Using for loop
		int ilength = sTemp.length();

		for (int i = ilength - 1; i >= 0; i--) {
			sRev = sRev + sTemp.charAt(i);
		}
		System.out.println(sRev);

		// Using String Buffer
		StringBuffer sb = new StringBuffer(sTemp);
		System.out.println(sb.reverse());

		// using recursion
		sRev = reverseString(sTemp);

		System.out.println(sRev);
		

	}

	private static String reverseString(String sTemp) {

		if(sTemp.isEmpty()) {
			return sTemp;
		}
		return reverseString(sTemp.substring(1)) + sTemp.charAt(0);
	}

}
