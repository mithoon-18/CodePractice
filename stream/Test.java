package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<String> products= Arrays.asList("Laptop","Pen","Notebook","Smartphone");
		
		List<String> prd = products.stream().collect(Collectors.toList());
		System.out.println(prd);
		
		//products.stream().filter(m->m.length()>5).map(String::toUpperCase)
	}
}
