package exceptionHandling;

public class StaticBlockException {
	static {
        if (true) {
            throw new RuntimeException("Error in static block!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Will this run?");
    }
}
