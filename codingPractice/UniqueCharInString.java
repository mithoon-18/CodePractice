package codingPractice;

import java.util.Collections;
import java.util.HashSet;

public class UniqueCharInString {
	public static void main(String[] args) {
		String s = "programming";
		
		HashSet set = new HashSet<>();
		for(char c :s.toCharArray())
		{
			set.add(String.valueOf(c));
		}
		
		System.out.println(String.join("", set));
	}
}
