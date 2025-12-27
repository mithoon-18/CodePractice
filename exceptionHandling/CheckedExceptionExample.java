package exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample  {

	 public static void main(String[] args) {
	        try {
	            readFile(); // Must handle IOException (checked)
	        } catch (IOException e) {
	            System.out.println("Caught checked exception: " + e.getMessage());
	        }
	    }

	    // Method declares that it throws a checked exception
	    public static void readFile() throws IOException {
	        FileReader fr = new FileReader("non_existing_file.txt"); 
	        System.out.println("This line won't execute if file not found.");
	    }
}
