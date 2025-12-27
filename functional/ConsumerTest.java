package functional;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> con = (str) -> System.out.println(str);
		
		con.accept("Mithun");
	}
}
