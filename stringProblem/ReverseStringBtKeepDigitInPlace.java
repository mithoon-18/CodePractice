package stringProblem;

public class ReverseStringBtKeepDigitInPlace {

	    public static void main(String[] args) {
	        String s = "a1b2c3dgj4";
	        char[] arr = s.toCharArray();
	        int left = 0, right = arr.length - 1;

	        while (left < right)
	        {
	        	
	            if (Character.isDigit(arr[left])) left++;
	            else if (Character.isDigit(arr[right])) right--;
	            else {
	                char temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	                left++;
	                right--;
	            }
	        }
	        System.out.println(new String(arr));
	    }

}
