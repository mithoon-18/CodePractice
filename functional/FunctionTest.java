package functional;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<String, Integer> f = (str) -> {
			return str.length();
		};
		
		Integer s = f.apply("mithun");
		
		System.out.println(s);
	}
}
