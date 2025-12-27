package codingPractice;

public class CompressString {

	public static void main(String[] args) {
		String input = "pppccaabcccccaaapph";		//output = p3c2a2b1c5a3p2h1
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i =0; i<input.length(); i++)
		{
			if(i+1<input.length() && input.charAt(i) == input.charAt(i+1))
			{
				count++;
			}
			else
			{
				sb.append(input.charAt(i)).append(count);
				count=1;
			}
		}
		
		System.out.println(sb);
	}
}
