package finallyDsaStarted.String;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Stirng");
		String str = sc.nextLine();
		
		
		String result = "";
		for(int i = str.length()-1; i>=0; i--)
		{
			char ch = str.charAt(i);
			result += ch;
		}
		System.out.println(result);
		
//		StringBuilder sb = new StringBuilder(str);
//		String s = sb.reverse().toString();
//		System.out.println(s);
	}
}
