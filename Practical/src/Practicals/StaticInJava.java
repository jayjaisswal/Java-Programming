package Practicals;

	class StaticExample 
	{
	    static int staticCount = 0; // Static variable

	    StaticExample() {
	        staticCount++;
	   }

	    static void showCount() {
	        System.out.println("Count: " + staticCount);
	    }
	}

	public class StaticInJava {
	    public static void main(String[] args) {
	        StaticExample obj1 = new StaticExample();
	        StaticExample obj2 = new StaticExample();
	        StaticExample.showCount(); // Accessing static method
	    }
	}



