package finallyDsaStarted.String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		String s = "abcabcbb";
		
		
		int left=0;
		int maxLen=0;
		String st ="";
		Set<Character> set = new HashSet<>();
		for(int right =0; right<s.length(); right++)
		{
			char ch = s.charAt(right);
			
			while(set.contains(ch))
			{
				set.remove(s.charAt(left));
				left++;
			}
			set.add(ch);
			maxLen = Math.max(maxLen, right-left+1);
			
//			int currentLen=right-left+1;
//			if(currentLen>maxLen)
//			{
//				maxLen = currentLen;
//				st = s.substring(left,right+1);
//			}
		}
		System.out.println(maxLen);
		//System.out.println(st);
		
	}
}
