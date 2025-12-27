package stringProblem;

public class ReverseWordInSentence {
	public static void main(String[] args) {
		String s = "Java Developer";
		
		//op :"avaJ repoleveD"
		
		String[] arr = s.split(" ");
		
		for(String str: arr) {
			String st = new StringBuilder(str).reverse().toString();
			System.out.print(st+" ");
		}
	}
}
