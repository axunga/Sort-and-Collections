package com.arrayList.app;

import java.util.ArrayList;
import java.util.List;

import com.arrayList.model.Employee;

public class MainApp {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("Adan", "Solorio", 123));
		employeeList.add(new Employee("Alam", "Vazquez", 456));
		employeeList.add(new Employee("Alan", "Gutierrez", 789));
		
		employeeList.forEach(i -> System.out.println(i));
		
		employeeList.set(2, new Employee("Alan", "Ochoa", 987));
		System.out.println("\nThe employee 'Alan' has been changed");
	
		employeeList.forEach(i -> System.out.println(i));
		
		System.out.println("the size of the list is: " + employeeList.size());
		
		employeeList.add(1, new Employee("Esteban", "Garcia", 147));
		System.out.println("\nThe employee 'Esteban' has been staged at the index 1");
		
		employeeList.forEach(i -> System.out.println(i));
		
	}

}
