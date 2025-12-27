package codingPractice;

public class GetCharCount {
public static void main(String[] args) {
	String s = "aabbcccddf";
	int count=1;
	StringBuilder str = new StringBuilder();
	for(int i =0; i< s.length();i++)
	{
		char ch = s.charAt(i);
		
		if(i+1 <s.length() && s.charAt(i)==s.charAt(i+1))
		{
			count++;
		}
		else
		{
			str.append(ch).append(count);
			count=1;
		}
	}
	
	System.out.println(str);
	
}
}
