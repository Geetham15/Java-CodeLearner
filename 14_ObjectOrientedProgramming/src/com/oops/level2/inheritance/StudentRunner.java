package com.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// Inheritance - IS A relationship
//		Student student = new Student();
//		student.setName("Geetha");
//		student.setEmail("Geetha@email.com");

//		Person person = new Person();
//		person.setName("Vignesh");
//		person.setEmail("Vignesh@email.com");
//		person.setPhoneNumber("234567890");
//		String value = person.toString();
//		System.out.println(value);
//		System.out.println(person);

		Employee employee = new Employee("Vignesh", "Programmer Analyst");
		// employee.setName("Vignesh");
		employee.setEmail("Vignesh@email.com");
		employee.setPhoneNumber("234-567-8901");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");

		System.out.println(employee);
	}

}
