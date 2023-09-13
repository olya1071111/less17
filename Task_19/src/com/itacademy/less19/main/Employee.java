package com.itacademy.less19.main.right;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	String depatment;
	private int employeeId;
	private String name;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(String depatment, int employeeId, String name, double salary) {
		this.depatment = depatment;
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	public String getDepatment() {
		return depatment;
	}

	public void setDepatment(String depatment) {
		this.depatment = depatment;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(depatment, employeeId, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(depatment, other.depatment) && employeeId == other.employeeId
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "\n depatment = " + depatment + ", ID = " + employeeId + ", surname = " + name
				+ ", salary = " + salary;
	}

	public int compareTo(Employee o) {
		return (int) (this.salary - o.salary);
	}

}
