package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
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

	public double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double percent) {
		salary *= (1+percent/100);
	}
	
	public String toString() {
		return String.format("%d, %s, %.2f", id, name, salary);
	}
}
