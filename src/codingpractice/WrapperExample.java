package codingpractice;

public class WrapperExample {

	public static void main(String[] args) {

		// Boxing using constructor
		Integer iObj1 = new Integer(111);
		Integer iObj2 = new Integer("222");
 
		//Boxing using valueOf Method
		Integer iObj3 = Integer.valueOf(333);
		Integer iObj4 = Integer.valueOf("444");
		
		System.out.println("********** After Boxing **********");
		System.out.println("iObj1 = "+iObj1);
		System.out.println("iObj2 = "+iObj2);
		System.out.println("iObj3 = "+iObj3);
		System.out.println("iObj4 = "+iObj4);
		
		//Unboxing using intValue and toString method
		int i1 = iObj1.intValue();
		String s2 = iObj2.toString();
		int i3 = iObj3.intValue();
		String s4 = iObj4.toString();
		
		System.out.println("********** After UnBoxing **********");
		System.out.println("i1 = "+i1);
		System.out.println("s2 = "+s2);
		System.out.println("i3 = "+i3);
		System.out.println("s4 = "+s4);
		
		
	}

}
