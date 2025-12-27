package testing;

public class StaticVsInstance {

	static String str ="constant";
	int age=6;
	
	
	public static void main(String[] args) {
		int age=7;
		
		StaticVsInstance s1 = new StaticVsInstance();
		StaticVsInstance s2 = new StaticVsInstance();
		StaticVsInstance s3 = new StaticVsInstance();
		
		s1.age=45;
		s2.age=12;
		
		
		
		s1.str=StaticVsInstance.str;
		
		System.out.println(s1.age);
		System.out.println(s1.str);
		System.out.println(StaticVsInstance.str);
		System.out.println();
		
		
		
		
	}
}
