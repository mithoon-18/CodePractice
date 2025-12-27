package codingPractice;

import java.util.HashSet;

public class LengthOfLongestSubString {
public static void main(String[] args) {
	String s1 = "abcabcbb"; 
	
	int start =0;
	int end =0;
	int maxlen=0;
	
	HashSet set = new HashSet();
	
	
	while(end < s1.length()){
		char ch = s1.charAt(end);
		
		if(!set.contains(ch))
		{
			set.add(ch);
			maxlen = Math.max(maxlen, end-start+1);
			end++;
		}
		else
		{
			set.remove(s1.charAt(start));
			start++;
		}
		
	}
	
	System.out.println(maxlen);
}
}
