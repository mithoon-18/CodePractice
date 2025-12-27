package testing;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("IT");
		list.add("Sales");
		
		
		ImmutableClass im= new ImmutableClass("rahul", "35000",list);
		
		System.out.println(im.getSalary());
		System.out.println(im.getDept());
		
		im.getDept().add("HR");
		
		System.out.println(im.getDept());
	}
}
