package com.Vector.app;

import java.util.List;
import java.util.Vector;

import com.Vector.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		List<Employee> employeeVector = new Vector<>();
		
		employeeVector.add(new Employee("Adan", "Solorio", 123));
		employeeVector.add(new Employee("Alam", "Vazquez", 456));
		employeeVector.add(new Employee("Alan", "Gutierrez", 789));
		
		employeeVector.forEach(i -> System.out.println(i));
		
		employeeVector.set(2, new Employee("Alan", "Ochoa", 987));
		System.out.println("\nThe employee 'Alan' has been changed");
	
		employeeVector.forEach(i -> System.out.println(i));
		
		System.out.println("the size of the list is: " + employeeVector.size());
		
		employeeVector.add(1, new Employee("Esteban", "Garcia", 147));
		System.out.println("\nThe employee 'Esteban' has been staged at the index 1");
		
		employeeVector.forEach(i -> System.out.println(i));
	}

}


