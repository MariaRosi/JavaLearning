package java8;
 
interface iTest {
	void m1();
}


public class LamdaExpression {
	int iVar1 = 10;//instance variable
	
	public void m2() {
		int iVar2 = 20;//local variable
		
		iTest itest = () -> 
		{
			iVar1 = 111;
			//iVar2 = 222;//Local variable iVar2 defined in an enclosing scope must be final or effectively final
			
			System.out.println(iVar1);
			System.out.println(iVar2);
		};
		
		itest.m1();
	}
	
	
	public static void main(String[] args) {
		
		LamdaExpression obj = new LamdaExpression();
		obj.m2();

	}

}
