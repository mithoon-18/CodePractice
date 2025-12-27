package multiThreading;

class SharedTaskBlock implements Runnable {
    private int count = 0;   // Shared resource
    private final Object lock = new Object(); // Custom lock object

    @Override
    public void run() {
    	synchronized (lock) {
        for (int i = 1; i <= 5; i++) {
            // Only lock the critical section
            
                count++;
                System.out.println(Thread.currentThread().getName() + " - Count: " + count);
        }

            try {
                Thread.sleep(200); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SyncBlockExample {
    public static void main(String[] args) {
        SharedTaskBlock task = new SharedTaskBlock(); // One shared object

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

