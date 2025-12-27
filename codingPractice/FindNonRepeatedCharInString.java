package codingPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeatedCharInString {

	public static void main(String[] args) {
		String s = "neosoft";
		
		LinkedHashMap<Character , Integer> map =new LinkedHashMap<>();
		for(char ch : s.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character , Integer> entry : map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.print(entry.getKey());
			}
		}
	}
}
