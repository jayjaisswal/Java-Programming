package Practicals;


	
	interface Animall {
	    void sound(); // Abstract method
	    void eat();   // Abstract method
	}

	class Dogg implements Animall {
	    public void sound() {
	        System.out.println("Dog barks");
	    }

	    public void eat() {
	        System.out.println("Dog eats");
	    }
	}

	public class BasicInterface {
	    public static void main(String[] args) {
	        Animall myDog = new Dogg();
	        myDog.sound(); // Outputs: Dog barks
	        myDog.eat();   // Outputs: Dog eats
	    }
	}



