package com.cognixia.jump.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner {

	public static void main(String[] args) {
		
		Integer[] integers = {2, 4, 6, 2, 4, 12, 3, 11};
		
		List<Integer> numbers = Arrays.asList(integers);
		
		numbers.forEach(System.out::println);
		
		int sum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
		
		System.out.println("The sum is: " + sum);
		
		int biggest = numbers.stream()
				.reduce((num1, num2) -> num1 > num2 ? num1 : num2)
				.get();
		
		System.out.println("The biggest number is: " + biggest);
		
		double avgInt = Stream.of(integers)
				.parallel()
				.mapToDouble(Integer::new)
				.average()
				.getAsDouble();
		
		System.out.println(avgInt);
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Matthew", 10, "JUMP"));
		employees.add(new Employee("Orquidia", 10, "JUMP"));
		employees.add(new Employee("Sumi", 10000000, "NASA"));
		employees.add(new Employee("Jai", 500000, "Tesla"));
		employees.add(new Employee("Nikita", 600000, "Apple"));
		employees.add(new Employee("Daven", 10000000, "NASA"));
		employees.add(new Employee("Sabeet", 5, "The Zoo"));
		
		Employee lowestSal = employees.stream()
				.reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2)
				.get();
		
		Optional<Employee> tom = employees.stream()
				.filter(e -> e.getName().equals("Tom"))
				.findFirst();
		
		if(tom.isPresent()) {
			System.out.println(tom.get());
		}
		else {
			System.out.println("Tom not found.");
		}
		
		System.out.println("The lowest salaried employee is " + lowestSal.getName());
		
		// Get departments from my Employee Data
		
		String allDepartments = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment))
				.keySet()
				.stream()
				.reduce((e1, e2) -> (e1 + " | " + e2))
				.get();
		
		System.out.println(allDepartments);
		
		// Exercise 6/4/2021
		
		Employee highestSal = employees.stream()
				.reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2)
				.get();
		
		System.out.println("The highest paid employee is " + highestSal.getName());
		
		List<String> sixFigures = new ArrayList<>();
		
		employees.stream()
			.forEach(e -> {
				if (e.getSalary() >= 100000) {
					sixFigures.add(e.getName());
				}
			});
		
		System.out.println("The following employees make at least 6 figures " + sixFigures);
		
		double averageSalary = employees.stream()
				.mapToDouble(e -> e.getSalary()).average().getAsDouble();
		
		System.out.println("The average salary is " + averageSalary);
		
		List<String> underSixFigures = new ArrayList<>();
		
		employees.stream()
			.forEach(e -> {
				if (e.getSalary() < 100000) {
					underSixFigures.add(e.getName());
				}
			});
		
		System.out.println("The following employees make less than 6 figures " + underSixFigures);
		
	}

}
