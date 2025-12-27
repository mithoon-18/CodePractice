package designPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

final class MyImmutable {

	//class cant be extend
	//once object is defined it can not be changed
	
//	final class
//	private final fields
//	set field using constructor
//	validate field inside constructor
//	use unmodified list and defecsive copies to return list objects
//	override hashcode,equals,toString
//	mutithread env
	
	private final int id;
	private final String name;
	private final List<String> skills;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public List<String> getSkills() {
		return Collections.unmodifiableList(new ArrayList<>(skills));
	}

	public MyImmutable(int id , String name, List<String> skills)
	{
		if(id<0)
		{
			throw new IllegalArgumentException("provide valid id");
		}
		this.id=id;
		this.name=name;
		this.skills=Collections.unmodifiableList(new ArrayList<>(skills));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name,skills);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(!(obj instanceof MyImmutable)) return false;
		
		MyImmutable o = (MyImmutable) obj;
		return o.id==id && name.equals(o.name) && skills.equals(o.skills);
	}
	@Override
	public String toString() {
		return "Student:"+"id="+id+",name="+name+",skills="+skills;
	}
	
	public static void main(String[] args) {
		List<String> skills = new ArrayList<>(List.of("IT","java","spirng"));
		MyImmutable obj = new MyImmutable(1, "ram",skills);
		System.out.println(obj.skills);
		skills.add(2,"angular");
		System.out.println(skills);
		System.out.println(obj.skills);
		MyImmutable obj1 = new MyImmutable(1, "ram",skills);
		System.out.println(obj1.skills);
		MyImmutable obj2 = new MyImmutable(1, "ram",skills);
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj==obj2);
		System.out.println(obj.equals(obj2));
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
		
		HashMap<MyImmutable, Integer> map = new HashMap<>();
		map.put(obj, 1);
		map.put(obj1, 1);
		map.put(obj2, 1);
		System.out.println(map.size());
		
		
	}
}
