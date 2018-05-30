package threads;


class ClassA {
	public synchronized void classAFirstMethod(ClassB classB) {
		System.out.println("Thread1 before calling the classBlastMethod");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		classB.classBlastMethod();
		
		System.out.println("Thread1 after calling the classBlastMethod");
	}
	
	public synchronized void classAlastMethod() {
		System.out.println("Inside classAlastMethod");
	}
}

class ClassB {
	
	public synchronized void classBFirstMethod(ClassA classA) {
		
		System.out.println("Thread2 before calling the classAlastMethod");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		classA.classAlastMethod();
		
		System.out.println("Thread2 after calling the classAlastMethod");
		
	}
	
	public synchronized void classBlastMethod() {
		System.out.println("Inside classBlastMethod");
	}
	
}

class DeadlockThread extends Thread {
	ClassA classA = new ClassA();
	ClassB classB = new ClassB();
	
	public void runClassAFirstMethod() {
		this.start();
		classA.classAFirstMethod(classB);//this is operated by main thread
	}
	
	public void run () {
		classB.classBFirstMethod(classA);//this is operated by the child thread
	}
}

public class DeadlockExample {

	public static void main(String[] args) {
		
		DeadlockThread deadlockThread = new DeadlockThread();
		
		deadlockThread.runClassAFirstMethod();
			
	}

}
