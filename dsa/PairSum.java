package dsa;

import java.util.Arrays;

public class PairSum {

	public static void main(String[] args) {
		
		int[] ar=pairSum();
		System.out.println(Arrays.toString(ar));
		//arr = [2, 4, 7, 11, 14]
		//target = 18
		
		
		
		}
	

	private static int[] pairSum() {
		int[] arr = {2, 4, 7, 11, 14};
		int target = 18;
		
		int left =0, right =arr.length-1;
		int sum=0;
		
		while(left< right)
		{
			sum= arr[left] +arr[right];
			
			if(sum == target)
			{
				return new int[] {arr[left], arr[right]};
				//System.out.println(Arrays.toString(new int[] {arr[left], arr[right]}));

			}
			
			if(sum > target)
			{
				right--;
			}
			else {
				left++;
			}
		
	}
		
		return new int[] {};
}
}
