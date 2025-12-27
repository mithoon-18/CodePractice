package dsa;

public class MaxSumOfSubarray {
	public static void main(String[] args) {
		//arr = [2,1,5,1,3,2], k = 3
				//Output = 9  (5+1+3)
		
		int[] arr= {2,1,5,1,3,2};
		int k = 3;
		
		int windowSum=0;
		for(int i =0; i<k; i++)
		{
			windowSum+=arr[i];
		}
		
		int sum =windowSum;
		int max=0;
		
		for(int j=k;j<arr.length;j++)
		{
			sum+=arr[j]-arr[j-k];
			
			max = Math.max(max, sum);
		}
		System.out.println(max);
		
	}
}
