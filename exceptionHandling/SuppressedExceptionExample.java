package exceptionHandling;

public class SuppressedExceptionExample {
	public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed: " + suppressed.getMessage());
            }
        }
    }

    public static void readFile() throws Exception {
        try (MyResource resource = new MyResource()) { // AutoCloseable
            throw new Exception("Exception in try block");
        }
    }
}

class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Exception while closing resource");
    }
}
