package multiThreading;

class SharedTaskSafe implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
        	System.out.println(i);
            increment(); // Use synchronized method
            try {
                Thread.sleep(200); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Synchronized method to prevent race condition
    private  void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " - Count: " + count);
    }
}

public class SameObjectThreadSafeExample {
    public static void main(String[] args) {
        SharedTaskSafe task = new SharedTaskSafe();
        SharedTaskSafe task1 = new SharedTaskSafe();// ONE shared object

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task1, "Thread-3");
        Thread t4 = new Thread(task1, "Thread-4");

        t1.start();
        t3.start();
        t2.start();
        t4.start();
    }
}

