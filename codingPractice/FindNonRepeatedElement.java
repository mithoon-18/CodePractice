package codingPractice;

import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatedElement {

	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
		
		
		HashMap<Integer, Integer> map=new HashMap<>();
		int count =1;
		for(int i: arr)
		{
			if(map.containsKey(i))
			{
				map.put(i, count+1);
			}
			else
			{
				map.put(i, count);
			}
		}
		
		System.out.println(map);
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(map.get(entry.getKey()) >1)
					{
						System.out.println(entry.getKey());
					}
			if(map.get(entry.getKey()) ==1)
			{
				System.out.println(entry.getKey());
			}
			
		}
	}
}
