package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		 
        list.add(new Employee("Alice","M",new Department("Sales","Bangalore"),new Designation("Manager")));
        list.add(new Employee("Bob","N",new Department("Tax","Mumbai"),new Designation("Ass.Manager")));
        list.add(new Employee("Ava","A",new Department("Training","Chennai"),new Designation("Trainer")));
        list.add(new Employee("John","T",new Department("Accounts","Mangalore"),new Designation("Deputy Manager")));
        list.add(new Employee("Peter","S",new Department("Sales","Mysore"),new Designation("Consultant")));
  
        
        List<Employee> salesManagers = list.stream().filter(employee -> "Sales".equals(employee.getDepartment().getDepartmentName()) &&"Manager".equals(employee.getDesignation().getDesignation_type())).collect(Collectors.toList());
        System.out.println("Sales Manager:");
        salesManagers.forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));
        
        
        List<Employee> mumbaiEmployees = list.stream().filter(employee -> "Mumbai".equals(employee.getDepartment().getLocation())).collect(Collectors.toList());
        System.out.println("\nMumbai Employees:");
        mumbaiEmployees.forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));
        
        List<String> combinedNames = list.stream().map(employee -> employee.getFirstName() + " " + employee.getLastName()).collect(Collectors.toList());
        System.out.println("\nCombined Names:");
        combinedNames.forEach(System.out::println);
	}

}
        

        

        
