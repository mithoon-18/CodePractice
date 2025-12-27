package multiThreading;

public class InterruptExample {
	public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                System.out.println("Thread sleeping...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        });

        t.start();
        Thread.sleep(2000); // Wait 2 seconds
        t.interrupt(); // Interrupt the sleeping thread
    }
}
