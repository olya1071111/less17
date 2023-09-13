package com.itacademy.less19.main.right;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeId() - o2.getEmployeeId();
	}
}
