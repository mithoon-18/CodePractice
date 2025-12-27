package stringProblem;

import java.util.stream.Collectors;

public class CheckAnagramString {

	public static void main(String[] args) {
		String s1 = "listen", s2 = "silent";
		
		boolean check =s1.chars().mapToObj(c -> String.valueOf((char) c)).sorted().collect(Collectors.joining())
		.equals(s2.chars().mapToObj(i-> String.valueOf((char) i)).sorted().collect(Collectors.joining()));
		if(check)
		{
			System.out.println("Anagram String");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
