package com.alacriti.demo.mutability;

public final class Employee {

	private final int id;
	private final String name;
	private final double salary;

	Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

}
