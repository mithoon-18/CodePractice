package codingPractice;

public class ReverseString {
	public static void main(String[] args) {
		String str = "java programming";
		
		String s="";
		String[] arr = str.split(" ");
		for(String st : arr)
		{
			for(int i=st.length()-1; i>=0;i--)
			{
				s +=st.charAt(i);
			}
			System.out.print(s+ " ");
			s="";
		}
		
		System.out.print(s);
		
	}
}
