package exceptionHandling;

public class ThreadExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("main threa working 1");
        //Thread t = new Thread(() -> {
            //try {
                System.out.println("Thread started");
                int x = 1 / 0; // ArithmeticException
            //} catch (Exception e) {
//                System.out.println("Caught in thread: " + e.getMessage());
//            }
       // });

       // t.start();
        
        System.out.println("main threa working");
    }
}
