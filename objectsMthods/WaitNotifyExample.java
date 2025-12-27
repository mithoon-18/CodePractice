package objectsMthods;

public class WaitNotifyExample {
    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(new Producer(buffer), "Producer");
        Thread consumer = new Thread(new Consumer(buffer), "Consumer1");
        Thread consumer1 = new Thread(new Consumer(buffer), "Consumer2");
        Thread consumer2 = new Thread(new Consumer(buffer), "Consumer3");

        producer.start();
        consumer.start();
        consumer1.start();
        consumer2.start();
    }
}

