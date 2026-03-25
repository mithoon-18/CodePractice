package finallyDsaStarted.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Stirng");
		String str = sc.nextLine();
		
		Character ch =str.chars().mapToObj(m -> (char) m).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet()
		.stream()
		.filter(n -> n.getValue()== 1)
		.map(Map.Entry::getKey)
		.findFirst()
		.get();
		
		System.out.println(ch);
		
//		LinkedHashMap<Character, Integer> map =new LinkedHashMap<>();
//		for(char c : str.toCharArray())
//		{
//			map.put(c, map.getOrDefault(c,0)+1);
//		}
//		for(char s : map.keySet())
//		{
//			if(map.get(s) == 1)
//			{
//				System.out.println(s);
//				return;
//			}
//				
//		}
	}
}
