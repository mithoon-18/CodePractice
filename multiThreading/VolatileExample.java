package multiThreading;

public class VolatileExample implements Runnable{

	public static  volatile boolean running = true;


	@Override
	public void run() {
		while(running)
		{
			System.out.println(Thread.currentThread().getName()+"running");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		VolatileExample obj = new VolatileExample();
		Thread t1 = new Thread(obj,"t1");
		Thread t3 = new Thread(obj,"t3");
		Thread t4 = new Thread(obj,"t4");
		
		Thread t2 = new Thread(()->{
			
			running = false;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t5 = new Thread(()->{
			
			running = false;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		t1.start();
		t3.start();
		t4.start();
		//Thread.sleep(1000);
		t2.start();
		t5.start();
		
	}



}
