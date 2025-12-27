package stream;

import java.util.Scanner;

public class Calsi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("enter first: ");
			int i = input.nextInt();
			System.out.println("enter second: ");
			int j = input.nextInt();
			input.nextLine();
			System.out.println("choose operation");
			String str = input.nextLine();
			 if("+".equals(str))
			 {
				 System.out.println("result"+(i+j));
				 System.out.println("do you want to continue y/n");
				 String str1 = input.nextLine();
				 if("y".equals(str1))
				 {
					 continue;
				 }
				 else if(str1 == "n")
				 {
					 System.out.println("thank you");
					 return;
				 }
			 }
			 
			 if("/".equals(str))
			 {
				 if(j == 0)
				 {
					 System.out.println("cannot divide by zero");
				 }
				 System.out.println("do you want to continue y/n");
				 String str1 = input.nextLine();
				 if(str1 == "y")
				 {
					 break;
				 }
				 else if("n".equals(str1))
				 {
					 System.out.println("thank you");
					 return;
				 }
			 }
			 
		}
				
	}
}
