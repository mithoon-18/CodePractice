package multiThreading;

public class SleepExample {

	public static void main(String[] args) {
		Thread t = new Thread( ()->{ 
			for(int i=0; i<=3 ; i++)
			{
				System.out.println(Thread.currentThread().getName() + " - Count: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
		
		t.start();
		}
}
