package com.itacademy.less19.main.right;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee person1 = new Employee("economic", 1, "Lisoy", 300);
		Employee person2 = new Employee("economic", 2, "Petrova", 250);
		Employee person3 = new Employee("accounting", 3, "Lashina", 350);
		
		List<Employee> person = new ArrayList<>();
		
		person.add(person1);
		person.add(person2);
		person.add(person3);
		
		Collections.sort(person);
		System.out.println(person);
		System.out.println("---------------------------------------------------------------------");
		
		Collections.sort(person, new IdComparator());
		System.out.println(person);
		System.out.println("---------------------------------------------------------------------");
	
		Collections.sort(person, new DepatmentComparator());
		System.out.println(person);
		System.out.println("---------------------------------------------------------------------");
	
		Collections.sort(person, new NameComparator());
		System.out.println(person);
		System.out.println("---------------------------------------------------------------------");
	
	}

}
