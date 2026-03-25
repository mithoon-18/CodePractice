package finallyDsaStarted.String;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Stirng");
		String str = sc.nextLine();
		
		Long cnt = str.chars().filter(s -> "aeiouAeiou".indexOf(s) != -1).count();
		System.out.println(cnt);
		
//		int count =0;
//		for(char ch : str.toCharArray())
//		{
//			if("aeiouAEIOU".indexOf(ch) != -1)
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
	}
}
