package dsa;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[]  input= {0,1,0,3,12,0,5,0};
		
		int i=0;
		for(int j=0; j<input.length-1;j++)
		{
//			if(input[i]==0  || input[i+1]==0)
//			{
//				if(input[i]==0  && input[i+1]==0)
//				{
//					if((i+2)<input.length)
//					{
//						if(input[i+2] !=0)
//						{
//							int temp = input[i];
//							input[i]=input[i+2];
//							input[i+2]=temp;
//							i++;
//						}
//					}
//					if((i+3)<input.length)
//					{
//						if(input[i+3] !=0)
//						{
//							int temp = input[i+1];
//							input[i+1]=input[i+3];
//							input[i+3]=temp;
//							i++;
//						}
//					}
//				}
//				
//				else if(input[i]==0)
//				{
//					int temp = input[i];
//					input[i]=input[i+1];
//					input[i+1]=temp;
//				}
//			}
			
			if (input[j] != 0) {
	            int temp = input[i];
	            input[i] = input[j];
	            input[j] = temp;
	            i++;
	        }
			
			
		}
		System.out.println(Arrays.toString(input));
		
	}}

