package multiThreading;

public class SynchronizationExample extends Thread{

	public  void run()
	{
		
		for(int i =0; i<100; i++)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
	
	public static void main(String[] args) {
		SynchronizationExample t = new SynchronizationExample();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);

		t1.start();
		t2.start();

//		SynchronizationExample t1 = new SynchronizationExample();
//		t1.start();
	}
}
