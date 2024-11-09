package Practicals;
class Garbage{
	public void finalize() {
		System.out.println("GOC");
	}
}

public class FinalizeMethod {
	public static void main(String args[]) {
		Garbage g1 = new Garbage();
		Garbage g2 = new Garbage();
		g1 = null;
		g2 = null;
		System.gc();
	}
}
