package codingPractice;

public class SortArray {
	public static void main(String[] args) {
		//Integer[] arr = {6,4,8,2,5};
		
		char[] arr = {'n','a','r','c','e'};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				
				if(arr[j]>arr[j+1])
				{
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=(char) temp;
				}
				
			}
			
		}
		
		for(char i: arr)
		{
			System.out.print(i);
		}
		
		
	}
}
