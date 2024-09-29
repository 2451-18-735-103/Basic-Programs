package com.cg.collectopic;

import java.util.ArrayList;
import java.util.List;

public class Data {
	public static void main(String args[]) {
	List<Employee> l=new ArrayList<>();
	l.add(new Employee(1001,"manasa",56000.00));
	l.add(new Employee(1002,"Ashish",57000.00));
	l.add(new Employee(1003,"Rishitha",58000.00));
	l.add(new Employee(1004,"Anusha",59000.00));
	l.add(new Employee(1005,"susmita jadav",60000.00));
	
	System.out.println("Employee name starts with A");
	l.stream()
    .filter(e -> e.getEmpName().startsWith("A"))
    .forEach(e -> System.out.println(e.getEmpName()));
	System.out.println("Employee salary greater than 25000");
	l.stream()
	.filter(e->e.getSalary()>25000)
	.forEach(e->System.out.println(e.getEmpName()));
	
	 Employee maxSalaryEmployee = l.stream()
             .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
             .orElse(null);
	
	 Employee minSalaryEmployee = l.stream()
             .min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
             .orElse(null);

     System.out.println("\nEmployee with maximum salary: " + maxSalaryEmployee.getEmpName());
     System.out.println("Employee with minimum salary: " + minSalaryEmployee.getEmpName());

     // d) Print the Employee Data whose empid = 1005
     System.out.println("\nEmployee with empid = 1005:");
     l.stream()
             .filter(e -> e.getEmpId() == 1005)
             .forEach(e -> System.out.println(e.getEmpName()));
}
}
