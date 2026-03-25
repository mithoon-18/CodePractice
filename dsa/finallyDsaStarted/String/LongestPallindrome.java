package finallyDsaStarted.String;

public class LongestPallindrome {
	public static void main(String[] args) {
		String s = "babadab";
		int maxLen = Integer.MIN_VALUE;
		String result = "";
		
		for (int i = 0; i < s.length()-1; i++) {

			String odd = pallindrome(s,i,i);
			String even = pallindrome(s ,i , i+1);
			
			int currentLen = Math.max(odd.length(), even.length());
			
			if(maxLen < currentLen)
			{
				maxLen = currentLen;
				result = currentLen == odd.length() ? odd : even ;
				
			}
			
		}
		System.out.println(result);
		
	}

	private static String pallindrome(String s, int i, int j) {
		int left = i;
		int right = j;
		
		while(left >= 0 && right <=s.length()-1) {
			if(s.charAt(left) != s.charAt(right))
			{
				break;
			}
			left--;
			right++;
		}
		return s.substring(left+1, right);
	}
}
