package codingPractice;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		
		for(int i=0;i<arr.length;i++)
		{
			if(i+1<arr.length-1 && arr[i] ==arr[i+1])
			{
				
			}
			else
			{
				System.out.println(arr[i]);
			}
		}

	}
}
