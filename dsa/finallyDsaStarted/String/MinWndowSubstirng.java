package finallyDsaStarted.String;

import java.util.HashMap;

public class MinWndowSubstirng {
	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		
		int minLen = Integer.MAX_VALUE;
		String result = "";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch: t.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		int left = 0;
		int count = 0;
		for(int right =0;right<s.length(); right++)
		{
			char c = s.charAt(right);
			if(map.containsKey(s.charAt(right))) {
				map.put(c, map.get(c)-1);
				if(map.get(c) >= 0)
				count++;
			}
			
			while(count == t.length())
			{
				String currentString = s.substring(left, right+1);
				if(minLen > currentString.length())
				{
					result = currentString;
					minLen = currentString.length();
				}
				
				char leftChar = s.charAt(left);
				if(map.containsKey(leftChar))
				{
					map.put(leftChar, map.get(leftChar)+1);
					if(map.get(leftChar) > 0)
					count--;
				}
				left++;
				
			}
			
		}
		System.out.println(result);
		
	}
}
