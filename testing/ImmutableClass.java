package testing;

import java.util.Collections;
import java.util.List;

public final class ImmutableClass {

	private final String name;
	private final String salary;
	private final List<String> dept;
	
	public String getName() {
		return name;
	}
	public String getSalary() {
		return salary;
	}
	
	public List<String> getDept() {
		return Collections.unmodifiableList(dept);
	}
	
	public ImmutableClass(String name, String salary , List<String> dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	
}
