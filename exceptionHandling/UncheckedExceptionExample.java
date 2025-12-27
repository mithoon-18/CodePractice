package exceptionHandling;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
       try {
           divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }

    // No throws declaration needed
    public static void divideByZero() {
        int result = 10 / 0; // ArithmeticException (unchecked)
        System.out.println("Result: " + result);
    }
}
