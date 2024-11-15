package Practicals;

public class PredefinedExceptionExample {
	 public static void main(String[] args) {
	        try {
	            // Example of ArithmeticException
	            int division = 10 / 0;
	            System.out.println("Result of division: " + division);
	        
	        } catch (ArithmeticException e) {
	            System.out.println("Caught ArithmeticException: " + e.getMessage());
	        }

	        try {
	            // Example of ArrayIndexOutOfBoundsException
	            int[] numbers = {1, 2, 3};
	            System.out.println("Accessing out-of-bounds index: " + numbers[5]);
	        
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
	        }

	        try {
	            // Example of NullPointerException
	            String text = null;
	            System.out.println("Length of text: " + text.length());
	        
	        } catch (NullPointerException e) {
	            System.out.println("Caught NullPointerException: " + e.getMessage());
	        }

	        try {
	            // Example of NumberFormatException
	            String invalidNumber = "abc";
	            int number = Integer.parseInt(invalidNumber);
	            System.out.println("Parsed number: " + number);
	        
	        } catch (NumberFormatException e) {
	            System.out.println("Caught NumberFormatException: " + e.getMessage());
	        }
	        
	        System.out.println("Program continues after handling exceptions.");

}
}
