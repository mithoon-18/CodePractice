package multiThreading;

public class TestThread {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		MyThread t1=new MyThread();
		System.out.println(t.getName());
		t.start();
		System.out.println(t1.getName());
		t1.start();
		
		
		Thread t2=new Thread(new MyRunnable());
		System.out.println(t2.getName());
		t2.start();
}
}
