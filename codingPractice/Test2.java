package codingPractice;

import java.util.HashSet;

public class Test2 {

	//Write a prgram to find longest substring without repeating characters
	//Input: s = "abcabcbb"
			//Output: 3
	
	public static void main(String[] args) {
		String s= "abcabcbb";
		int max=0;
		
		HashSet<Character> set = new HashSet<>();
		for(int i=1; i<s.length();i++)
		{
			if(s.charAt(i) == s.charAt(i-1))
			{
				set.remove(i);
			}
			set.add(s.charAt(i));
			
			max=Math.max(max, set.size());
		}
		System.out.println(max);
	}
}
