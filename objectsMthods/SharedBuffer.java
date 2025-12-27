package objectsMthods;

class SharedBuffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) { // buffer full
            try {
            	System.out.println(Thread.currentThread().getName()+"waiting to produce");
                wait(); // producer waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        data = value;
        hasData = true;
        System.out.println("Produced: " + value);

        notify(); // notify consumer
    }

    public synchronized void consume() {
        while (!hasData) { // buffer empty
            try {
            	System.out.println(Thread.currentThread().getName()+"waiting to consume");
                wait(); // consumer waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notify(); // notify producer
    }
}

