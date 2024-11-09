package Practicals;

public class TryCatch {
	try {
		int a = 10,b=0,c;
		c=a/b;
		System.out.println(c);
		
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	
	

}
