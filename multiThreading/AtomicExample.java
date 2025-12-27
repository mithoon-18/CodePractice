package multiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

	public static AtomicInteger count = new AtomicInteger();
	//static int count=0;
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(()->{
			for(int i =0; i<10000;i++)
			{
				count.incrementAndGet();
				//count++;
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i =0; i<10000;i++)
			{
				count.incrementAndGet();
				//count++;
			}
		});
		
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(count);
		
		
		
		
	}
}
