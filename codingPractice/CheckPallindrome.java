package codingPractice;

import java.util.Scanner;

public class CheckPallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String str = sc.nextLine();
		
		String reversed = "";
		
		for(int i = str.length()-1; i>=0;i--)
		{
			reversed += str.charAt(i);
		}
		System.out.println(reversed);
		
		if(str.equals(reversed))
		{
			System.out.println("its pallindrome");
		}else {
			System.out.println("not pallindrome");
		}
	}
}
