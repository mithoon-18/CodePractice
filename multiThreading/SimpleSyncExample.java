package multiThreading;

class Counter {
    private int count = 0;

    // Synchronized method ensures only one thread updates count at a time
    public synchronized void increment() {
        //count++;
        System.out.println(count++);
    }

    public int getCount() {
        return count;
    }
}

public class SimpleSyncExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
                System.out.println(i);
                
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}

