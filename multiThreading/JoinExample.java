	package multiThreading;

public class JoinExample {
	 public static void main(String[] args) throws InterruptedException {
	        Thread t1 = new Thread(() -> {
	            for (int i = 1; i <= 5; i++) {
	                System.out.println("Thread-1: " + i);
	                try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
	            }
	        });

	        t1.start();
	        t1.join(); // Main thread waits until t1 finishes

	        Thread t2 = new Thread(()->{
	        	System.out.println("t2 running");
	        });
	        t2.start();
	        System.out.println("Main thread continues after t1 is done.");
	    }
}
