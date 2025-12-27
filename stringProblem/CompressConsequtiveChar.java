package stringProblem;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CompressConsequtiveChar {
	
	public static void main(String[] args) {
		
			String input ="pppccaabcccccaaapp";
			//Output: "p3c2a2b1c5a3p2"
			
			int index =0;
			int count =0;
			while(index<input.length())
			{
				for(int i =index;i<input.length()-1;i++)
				{
					if(input.charAt(index) == input.charAt(i+1))
					{
						count++;
					}
					else {
						break;
					}
				}
				String s= String.valueOf(input.charAt(index));
				int nCount = count+1;
				index=index + nCount;
				System.out.print(s+nCount);
				count=0;
			}
			
		
		
	}
		

	
}


