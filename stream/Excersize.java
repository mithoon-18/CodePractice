package stream;

 class Employees{
	private String name;
	private double salary;
	
	public Employees(String name , double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employees [name=" + name + ", salary=" + salary + "]";
	}


	public void getDetails()
	{
		System.out.println(this);
	}
}
 
 class Manager extends Employees
 {
	 private String department;

	public Manager(String name , double salary ,String department) {
		super(name, salary);
		this.department = department;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Manager [department=" + department + ", name=" + getName() + ", salary=" + getSalary() + "]";
	}



	@Override
	public void getDetails()
	{
		System.out.println(this);
	}
	
	 
 }

public class Excersize {
	public static void main(String[] args) {
		
		Employees emp = new Employees("Alice", 50000d);
		emp.getDetails();
		
		Manager m = new Manager("Bob", 80000d, "IT");
		m.getDetails();
		
	}

}
