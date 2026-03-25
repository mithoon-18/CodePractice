package finallyDsaStarted.String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String string = "programming";
		
		string.chars().mapToObj(c -> (char) c).distinct().forEach(System.out::print);
		
		System.out.println();
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(char ch : string.toCharArray())
		{
			set.add(ch);
		}
		StringBuilder result = new StringBuilder();
		for( char c: set)
		{
			result.append(c);
		}
		System.out.println(result);

	}

}
