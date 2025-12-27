package codingPractice;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Integer[] arr = {6,4,8,2,5};
		Integer[] arr1 = new Integer[arr.length];
		
		int index = 0;
		int count = 0;
		for(int i : arr)
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if(i != index)
				{
					if(i > arr[j])
					{
						count++;
					}
				}
			}
			while(arr1[count] != null)
			{
				count++;
			}
			arr1[count] = i;
			count = 0;
			index++;
			
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[2]);
	}
}
