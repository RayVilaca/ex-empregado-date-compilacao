package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int quantity = sc.nextInt();
		System.out.println();
		
		int id;
		String name;
		double salary;
		
		Employee emp;
		
		for(int i = 1; i < quantity+1; ++i) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			System.out.println();
			emp = new Employee(id, name, salary);
			list.add(emp);
		}
		System.out.print("Enter the employee id that will have salary encrease: ");
		int ids = sc.nextInt();

		Employee achei = list.stream().filter(x -> x.getId() == ids).findFirst().orElse(null);
		if(achei == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			achei.increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees: ");
		
		for(Employee x : list) {
			System.out.println(x);
		}
		
		sc.close();
		
	}

}
