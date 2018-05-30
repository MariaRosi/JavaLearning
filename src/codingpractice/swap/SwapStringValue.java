package codingpractice.swap;

public class SwapStringValue {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println("The value before swapping str1 = "+str1+ " and str2 = "+str2);
		
		str1 = str1 + str2 ;//HelloWorld
		
		str2 = str1.substring(0, str1.length()-str2.length());//Hello
		
		str1 = str1.substring(str2.length());
		
		System.out.println("The value after swapping str1 = "+str1+ " and str2 = "+str2);

	}

}
