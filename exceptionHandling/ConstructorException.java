package exceptionHandling;

public class ConstructorException {
	public ConstructorException() {
        throw new RuntimeException("Constructor failed");
    }

    public static void main(String[] args) {
        try {
            new ConstructorException();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
