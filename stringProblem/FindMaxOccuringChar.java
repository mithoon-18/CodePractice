package stringProblem;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMaxOccuringChar {
public static void main(String[] args) {
	String str = "successes";
	
	String s = str.chars().mapToObj(c->String.valueOf((char) c)).collect(Collectors.groupingBy(f->f,Collectors.counting()))
	.entrySet()
	.stream()
	.max(Comparator.comparing(Map.Entry::getValue))
	.map(m -> m.getKey())
	.get();
	
	
	System.out.println(s);
}
}
