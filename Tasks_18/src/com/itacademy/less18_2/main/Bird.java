package com.itacademy.less18_2.main;

import java.util.Objects;

public class Bird implements Flyable {
	private double wingLength;
	private String name;

	public Bird(String name, double wingLength) {
		this.name = name;
		this.wingLength = wingLength;
	}

	@Override
	public boolean takeOff() {
		System.out.println("Bird is take of.");
		return true;
	}

	@Override
	public boolean land() {
		System.out.println("Bird landed");
		return true;
	}

	@Override
	public boolean fly() {
		System.out.println("Bird is fly");
		return true;
	}

	public double getWingLength() {
		return wingLength;
	}

	public void setWingLength(double wingLength) {
		this.wingLength = wingLength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, wingLength);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(wingLength) == Double.doubleToLongBits(other.wingLength);
	}

	@Override
	public String toString() {
		return "Bird [wingLength=" + wingLength + ", name=" + name + "]";
	}

}
