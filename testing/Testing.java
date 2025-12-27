package testing;

public class Testing {
	public static void main(String[] args) {
//	 final String s ="mithun";
//	 System.out.println(System.identityHashCode(s));
//		//s=s+"ram";
//		System.out.println(System.identityHashCode(s));
//		
//		
//		System.out.println(s==s);
		
		String s1 ="ram";
		String s2 ="ramSham";
		String s3 =s1+s2;
		
		String s4 =new String("ramSham").intern();
		s4=s3;

		
		System.out.println(s3==s4);
		System.out.println(s2==s4);
				
	}
}
