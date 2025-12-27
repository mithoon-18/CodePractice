package dsa;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int[] arr={1,1,2,2,3};
		removeDuplicate(arr);
		
		
		
	}

	private static void removeDuplicate(int[] arr) {
		int insertIndex =0;


		
		for(int fast=1; fast <arr.length; fast++)
		{
			if(arr[fast-1] != arr[fast])
			{
				insertIndex++;
				arr[insertIndex]=arr[fast];
			}
		}
		
		int[] unique = Arrays.copyOfRange(arr, 0, insertIndex+1);
		System.out.println(Arrays.toString(unique));
		System.out.println(Arrays.toString(arr));
		
	}
	
}
