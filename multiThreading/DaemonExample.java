package multiThreading;

public class DaemonExample {
	public static void main(String[] args) {
		Thread demoanThread = new Thread(()->{
			while (true) {
			System.out.println(Thread.currentThread().getName() + " running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
		});
		
		demoanThread.setName("Demon Thread");
		demoanThread.start();
		
		Thread t = new Thread(()->{
			System.out.println("thread end");
		});
		t.start();
		System.out.println("Main thread ends, JVM will exit...");
	}
}
