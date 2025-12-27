package stringProblem;

import java.util.stream.Collectors;

public class FindFirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "swiss";
		
		 Character ch = str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(f->f,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(s-> s.getValue()==1)
		.map(s->s.getKey())
		.findFirst()
		.get();
		 
		 System.out.println(ch);
	}
}
