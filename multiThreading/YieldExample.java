package multiThreading;

public class YieldExample {
	public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                Thread.yield(); // Suggest scheduler to switch thread
            }
        };

        new Thread(task, "Thread-A").start();
        new Thread(task, "Thread-B").start();
        new Thread(task).start();
    }
}
