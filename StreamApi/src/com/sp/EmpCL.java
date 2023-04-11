package com.sp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EmpCL {

	public static void main(String[] args) {
		List<Employee>emp=new ArrayList<>();
		
		emp.add(new Employee("sunil","kumar","pra"));
		emp.add(new Employee("chandu","kumar","pra"));
		emp.add(new Employee("mohan","singh","pra"));
		System.out.println(emp);
		 
	List<String>name= emp.stream().filter(e->e.middlename.equals("Kumar")).map(Employee::getFullName).collect(Collectors.toList());
	System.out.println(name.iterator().hasNext());
	
	}

}
