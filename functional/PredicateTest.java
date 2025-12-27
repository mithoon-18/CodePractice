package functional;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven = (n) -> n%2 == 0;	 
		
		boolean b = isEven.test(3);
		
		System.out.println(b);
	}
}
