package finallyDsaStarted.String;

public class StringComparision {
	public static void main(String[] args) {
		String s = "aaabbcf";			//a3b2c1
		
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++)
		{
			if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1))
			{
				count++;
			}else {
				sb.append(s.charAt(i)).append(count);
				count = 1;
			}
		}
		System.out.println(sb);
		
	}
}
