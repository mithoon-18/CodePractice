package multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedTaskLock implements Runnable {
    private int count = 0; // Shared resource
    private final Lock lock = new ReentrantLock(); // Explicit lock

    @Override
    public void run() {
    	
        for (int i = 1; i <= 5; i++) {
        	lock.lock(); // Acquire lock
            try {
                count++;
                System.out.println(Thread.currentThread().getName() + " - Count: " + count);
            } finally {
                lock.unlock(); // Always release lock
            }

            try {
                Thread.sleep(200); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        SharedTaskLock task = new SharedTaskLock(); // One shared object

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

