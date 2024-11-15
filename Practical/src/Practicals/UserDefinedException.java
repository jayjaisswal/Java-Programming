package Practicals;


	
	
//	 Step 1: Define the custom exception class
	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);  // Pass the message to the parent Exception class
	    }
	}

	// Step 2: Create a method that throws the custom exception
	class Registration {
	    public void registerUser(int age) throws InvalidAgeException {
	        if (age < 18) {
	            throw new InvalidAgeException("Age must be 18 or above to register.");
	        } else {
	            System.out.println("User registered successfully!");
	        }
	    }
	}

	// Step 3: Test the custom exception handling
	public class UserDefinedException {
	    public static void main(String[] args) {
	        Registration reg = new Registration();

	        try {
	            reg.registerUser(16);  // Trying to register a user with invalid age
	        } catch (InvalidAgeException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}



