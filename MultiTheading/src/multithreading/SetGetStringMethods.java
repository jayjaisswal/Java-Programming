package multithreading;

class Test extends Thread
{
	public void run()
	{
		
		System.out.println("Thread task t1 is in : " + Thread.currentThread().getName());
		
	}
	
}

public class SetGetStringMethods {
	public static void main(String args[]) 
	{
		System.out.println("Hello1 is in : " + Thread.currentThread().getName());
		Test t1 = new Test();
		t1.start();
	
		
		Test t2 = new Test();
		t2.start();
		
		Test t3 = new Test();
		t3.setName("t3 thread");
		t3.start();
	
		
	}
	

}



