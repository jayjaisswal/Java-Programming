package Practicals;

public class TryWithMultipleCatch {
    public static void main(String args[]) {
        try {
            int a = 10 / 0;
            System.out.println(a);

            int[] b = new int[5];  
            System.out.println(b[7]);  

            String str = null;  
            str = str.toUpperCase();  

        } catch (ArrayIndexOutOfBoundsException e) {  
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NullPointerException e) {  
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
