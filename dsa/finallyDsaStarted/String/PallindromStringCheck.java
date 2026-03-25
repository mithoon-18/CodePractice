package finallyDsaStarted.String;

import java.util.Scanner;

public class PallindromStringCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Stirng");
		String str = sc.nextLine();
		
		int left=0;
		int right= str.length()-1;
		
		while(left < right)
		{
			if(str.charAt(left) != str.charAt(right))
			{
				System.out.println("String is not pallindrome");
				return;
			}
			left++;
			right--;
		}
		System.out.println("String is pallindrome");
	}
}
