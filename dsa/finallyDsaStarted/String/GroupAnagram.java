package finallyDsaStarted.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
	public static void main(String[] args) {
		 String[] strs = {"eat","tea","tan","ate","nat","bat"};   		//op =[[eat, tea, ate], [tan, nat], [bat]]
		 
		 
		HashMap<String, List<String>> map = new HashMap<>();
		 for(String s : strs) {
			 
			 char[] arr = s.toCharArray();
			 Arrays.sort(arr);
			 String str = new String(arr);
			 
			 map.putIfAbsent(str, new ArrayList());
			 map.get(str).add(s);
			  
		 }
		 System.out.println(map.values());
		 
	}
}
