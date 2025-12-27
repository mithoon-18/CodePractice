package stream;

import java.util.Arrays;
import java.util.Collections;

public class StringInStream {
	public static void main(String[] args) {
		findFirstNonRepeatingString("swisswi");
	}
	
	private static void findFirstNonRepeatingString(String string) {
		String[] arr = string.split("");
		String str = Arrays.stream(arr).filter(s->Collections.frequency(Arrays.asList(arr), s)==1).findFirst().orElse("no non-repeating char");
		
		System.out.println(str);
	}
}
