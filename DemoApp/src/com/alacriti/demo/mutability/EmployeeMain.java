package com.alacriti.demo.mutability;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(1001, "Ajay kumar", 5000.50);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
	}

}
