package codingPractice;

public class RearrangeZeroToLast {
	public static void main(String[] args) {
		String str ="32412120000";
		String s="";
		int count =0;
		String st="";
		for(char ch : str.toCharArray())
		{
			if(ch=='0')
			{
				st+=ch;
				count++;
			}
			else
			{
				s+=ch;
			}
		}
		
		StringBuilder stB=new StringBuilder();
		stB.append(st).append(s);
		
		for(int i=0;i<count;i++)
		{
			s+='0';
		}
		
		System.out.println(s);
		System.out.println(stB);
	}
}
