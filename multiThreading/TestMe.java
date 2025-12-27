package multiThreading;

public class TestMe implements Runnable {
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub

		for(int i=0; i<10;i++)
		{
			System.out.print(i);
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
				Thread.yield();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void printingg() throws InterruptedException 
	{
		while(true)
		{
			System.out.println("Hello");
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		TestMe obj = new TestMe();
		DaemonTask dTask=new DaemonTask();
		
		Thread t= new Thread(obj);
		Thread t1= new Thread(obj);
		Thread t3= new Thread(obj);
		Thread t4=new Thread(obj);
		//Thread t3= new Thread(dTask);
//		t3.setDaemon(false);
//		//t3.setName("deamon");
//		t3.start();
		t.start();
		t1.start();
		t3.start();
		t4.start();
		
		//t1.join();
		
		System.out.println("task done");
		
	}

}
