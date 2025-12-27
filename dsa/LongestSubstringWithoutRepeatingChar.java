package dsa;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		String str = "abcabcbb";
		
		int left=0; 
		int max =0;
		int currentMax=0;
		Set<String> set = new HashSet<>();
		String s="";
		
		for (int i = 0; i < str.length(); i++) {
			String ch = String.valueOf(str.charAt(i));
			
			if(set.contains(ch))
			{
				set.remove(str.charAt(left));
				left++;
			}
			set.add(ch);
			
			max =Math .max(max, i-left+1);
			
			if(max> currentMax)
			{
				currentMax=max;
				s= String.join("", set);
			}
		}
		System.out.println(max);
		System.out.println(s);
	}
}
