package stringProblem;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str ="bananaa";  //op : "ban"
		
		str.chars().mapToObj(c -> (char) c).distinct().forEach(System.out::print);
	}
}
