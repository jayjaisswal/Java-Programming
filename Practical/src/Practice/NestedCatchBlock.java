package Practice;

public class NestedCatchBlock {
	public static void main(String args[]) {
		try {
            int numbers[] = {10, 20};
            int result = numbers[2] / 0; 
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            
            
            try {
                int Result2 = 20 / 0; 
                System.out.println(" Result2: " + Result2);
            } catch (ArithmeticException c) {
                System.out.println( c);
            }
            
        } finally {
            System.out.println("Execution completed.");
        }

	}

}


