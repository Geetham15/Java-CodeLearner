package com.oops.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {

	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;

	public Employee() {
		// super();
		System.out.println("Employee constructor");
	}

	public Employee(String name, String title) {
		super(name);
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employerName;
	}

	public void setEmployer(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format(
				"name - %s , email - %s, phoneNumber - %s, title - %s, employerName - %s, employeeGrade - %c, salary - %d",
				super.getName(), super.getEmail(), super.getPhoneNumber(), title, employerName, employeeGrade, salary);
	}

}
