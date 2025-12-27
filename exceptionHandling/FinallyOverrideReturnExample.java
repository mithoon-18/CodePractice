package exceptionHandling;

public class FinallyOverrideReturnExample {
	public static void main(String[] args) {
        System.out.println("Returned value: " + testMethod());
    }

    public static int testMethod() {
        try {
            System.out.println("Inside try block");
            return 10/0;  // Returning 10
        } catch (Exception e) {
            System.out.println("Inside catch block");
            return 20;  // Would return 20 if exception happened
        } finally {
            System.out.println("Inside finally block");
            return 30;  // ✅ This overrides both try and catch return values
        }
    }
}
