package Practice;

public class NestedFinallyExample {
	public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            
            try {
                System.out.println("Inner try block");
                int result = 10 / 0; 
            } catch (ArithmeticException e) {
                System.out.println("Inner catch block: " + e.getMessage());
            } finally {
                System.out.println("Inner finally block");
            }

        } catch (Exception e) {
            System.out.println("Outer catch block: " + e.getMessage());
        } finally {
            System.out.println("Outer finally block");
        }

        System.out.println("Program continues");
    }
}


