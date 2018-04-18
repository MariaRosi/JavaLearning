package coreJava;

public class SwapIntegerValue {

	public static void main(String[] args) {

		// 1.Using temp variable
		int a = 7;
		int b = 3;
		int temp;

		System.out.println("The value of a is Before " + a);
		System.out.println("The value of b is Before " + b);

		temp = a; // 7
		a = b; // 3
		b = temp;// 7

		System.out.println("The value of a is After " + a);
		System.out.println("The value of b is After " + b);

		// 2. Using + operator
		int c = 10;
		int d = 5;

		System.out.println("The value of c is Before " + c);
		System.out.println("The value of d is Before " + d);

		c = c + d; // 15
		d = c - d; // 10
		c = c - d; // 5

		System.out.println("The value of c is After " + c);
		System.out.println("The value of d is After " + d);

		// 3.Using * operator
		int e = 4;
		int f = 8;

		System.out.println("The value of c is Before " + e);
		System.out.println("The value of d is Before " + f);

		e = e * f; // 32
		f = e / f; // 4
		e = e / f; // 8

		System.out.println("The value of c is After " + e);
		System.out.println("The value of d is After " + f);

	}

}
