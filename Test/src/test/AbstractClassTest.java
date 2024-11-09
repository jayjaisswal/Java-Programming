package test;
abstract class A1{
	void a() {
		System.out.println("hello");
	}
	
	abstract void run();
	
}

class B extends A1{
	void run() {
		System.out.println("HEllo Abstract");
	}
}



public class AbstractClassTest {
	public static void main(String args[])
	{
		B obj = new B();
		obj.run();
	}
	

}

