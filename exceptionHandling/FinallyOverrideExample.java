package exceptionHandling;

public class FinallyOverrideExample {
	 public static void main(String[] args) {
	        try {
	            System.out.println(testMethod());
	        } catch (Exception e) {
	            System.out.println("Caught in main: " + e.getMessage());
	        }
	    }

	    public static int testMethod() {
	        try {
	            System.out.println("Inside try block");
	            int result = 10 / 0; // ArithmeticException
	            return result;
	        } catch (ArithmeticException e) {
	            System.out.println("Inside catch block");
	            throw new RuntimeException("Exception from catch"); // Throwing exception
	        } finally {
	            System.out.println("Inside finally block");
	            throw new RuntimeException("Exception from finally"); // Overrides previous exception
	        }
	    }
}
