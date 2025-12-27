package codingPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Test1
{
	public static void main(String[] args) {
		
		List<Employee> list = Employee.getEmployeeList();
		
		//1. How many male and female employees are there in the organization?
		List<Employee> maleEmp = list.stream().filter(s->"Male".equals(s.getGender())).collect(Collectors.toList());
		List<Employee> femaleEmp = list.stream().filter(s->"Female".equals(s.getGender())).collect(Collectors.toList());
		System.out.println("Male emp: "+ maleEmp);
		System.out.println("Female emp: "+ femaleEmp);
		
		//2. How many employees are there in each department?
		
		Map<String, Long> empInEachDept = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(empInEachDept);
		

		//3. Find the average salary of the male and female employee ?
		
		Double avgSalMale = list.stream().filter(s->"Male".equals(s.getGender())).collect(Collectors.averagingDouble(Employee::getSalary));
		Double avgSalFemale = list.stream().filter(s->"Female".equals(s.getGender())).collect(Collectors.averagingDouble(Employee::getSalary));
		
		System.out.println("Average salary of Male : "+avgSalMale);
		System.out.println("Average salary of Female : "+avgSalFemale);
		
		
	}
}


//dcd-rahc-kfs
	

	
