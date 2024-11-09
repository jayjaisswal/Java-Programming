package Practicals;
	class Animals {
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dogs extends Animals {
	    @Override
	    void sound() {
	        System.out.println("Dog barks");
	    }
	}

	class Cats extends Animals {
	    @Override
	    void sound() {
	        System.out.println("Cat meows");
	    }
	}

	public class MethodOverriding {
	    public static void main(String[] args) {
	        Animals myDog = new Dogs();
	        Animals myCat = new Cats();
	        
	        myDog.sound(); 
	        myCat.sound(); 
	    }
	}



