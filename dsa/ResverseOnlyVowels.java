package dsa;

public class ResverseOnlyVowels {
	public static void main(String[] args) {
		String str="hello";
		
		String[] arr = str.split("");
		
		int left =0, right = arr.length-1;
		
		while(left<right)
		{
			if("aeiou".contains(arr[left]) && "aeiou".contains(arr[right]))
			{
				String ch= arr[left];
				arr[left]=arr[right];
				arr[right] = ch;
				left++;
				right--;
				
			}
			else if(!"aeiou".contains(arr[left]))
			{
				left++;
			}
			else if(!"aeiou".contains(arr[right]))
			{
				right--;
			}
		}
		
		String s = String.join("", arr);
		System.out.println(s);
		
	}
}
