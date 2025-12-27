package designPattern;

public class SingletonDesignPattern {

	//eager initilization-also load when no reuirement
	//lazy initilization-not thread safe
	//synchronized method-performance affected due to whole method block
	//synchronized block - perfect 
	
	private static SingletonDesignPattern instance;
	
	private SingletonDesignPattern()
	{
		
	}
	
	public static SingletonDesignPattern getInstance()
	{
		if(instance == null)
		{
			instance = new SingletonDesignPattern();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		SingletonDesignPattern obj=SingletonDesignPattern.getInstance();
		SingletonDesignPattern obj1=SingletonDesignPattern.getInstance();
		SingletonDesignPattern obj2=SingletonDesignPattern.getInstance();
		SingletonDesignPattern obj3=SingletonDesignPattern.getInstance();
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
	}
}
