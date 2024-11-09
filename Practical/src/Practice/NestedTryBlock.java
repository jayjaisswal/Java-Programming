package Practice;

public class NestedTryBlock {
	public static void main(String args[]) {
	 try {// outer try
        
         // Nested try block
         try {
             System.out.println("Inner try block");
             int[] numbers = {1, 2, 3};
             System.out.println("Accessing array element: " + numbers[2]);
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Inner catch block: Array index out of bounds");
         }
         
         // outer try block code so that inner execute smoothly
         System.out.println("Outer try block");
         int result = 10 / 2;
         System.out.println("Result of division: " + result);
         
         
     } catch (ArithmeticException e) {
         System.out.println("Outer catch block: Division by zero");
     }
     
     System.out.println("Program continues...");

}
}
