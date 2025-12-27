package functional;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<String> sup = () -> "I am supplier";

		System.out.println(sup.get());
	}
}
