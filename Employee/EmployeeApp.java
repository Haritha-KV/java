package com.program;
import java.util.Scanner;
import com.program.employee;

public class EmployeeApp {
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Employee ID: ");
	        int id = scanner.nextInt();

	        scanner.nextLine();

	        System.out.print("Enter Employee Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Employee Age: ");
	        int age = scanner.nextInt();

	        scanner.nextLine();

	        System.out.print("Enter Employee Salary: ");
	        String salary = scanner.nextLine();

	        employee employee = new employee(name, id, age, salary);

	        System.out.println("\nEmployee Details:");
	        com.program.employee.displayEmployeeDetails();

	        scanner.close();
	    }

}
