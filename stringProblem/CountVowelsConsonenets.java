package stringProblem;

public class CountVowelsConsonenets {
	public static void main(String[] args) {
		String str = "springboot";
		
		//op : Vowels = 3, Consonants = 7
		
		int vowels =0;
		int consonants=0;
		for(char c : str.toCharArray())
		{
			if("aeiou".contains(String.valueOf(c)))
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
	}
}
