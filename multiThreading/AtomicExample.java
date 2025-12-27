package multiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
	//Atomicity read,modify and write operation are indivisible
	//if directly using int count and two or more thread individual accesing count so they able to read same value but whie updating one can dot do.
	
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

