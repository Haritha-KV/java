package com.program;

public class employee {
	    private static String name;
	    private static int id;
	    private static int age;
	    private static String salary;
	    
	    public employee(String name, int id, int age, String salary) {
	        this.name = name;
	        this.id = id;
	        this.age = age;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getSalary() {
	        return salary;
	    }

	    public void setDepartment(String salary) {
	        this.salary = salary;
	    }
	    
	    public static void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("salary: " + salary);
	    }
}
