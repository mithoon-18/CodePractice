package stringProblem;

public class LongestSubstringwtRepeatingChar {
	public static void main(String[] args) {
		String str = "abcabcbb";
	
		String temp = "";
		String lStr = "";
		int index = 0;
		
		for(char c : str.toCharArray())
		{
			temp+=c;
			for (int i = index; i < str.length(); i++) 
			{
				if(i != index)
				{
					if(!temp.contains(String.valueOf(str.charAt(i))))
					{
						temp+=str.charAt(i);
					}
					else
					{
						break;
					}
				}
				
			}
			
			if(lStr.length()<temp.length())
			{
				lStr = temp;
			}
			temp ="";
			index++;
		}
		
		System.out.println(lStr);
		
		
	}
}
