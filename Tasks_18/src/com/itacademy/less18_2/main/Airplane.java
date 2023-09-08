package com.itacademy.less18_2.main;

import java.util.Objects;

public class Airplane implements Flyable {
	private double size;
	private double speed;

	public Airplane(double size, double speed) {
		this.size = size;
		this.speed = speed;
	}

	@Override
	public boolean takeOff() {
		System.out.println("Airplane is take of.");
		return true;
	}

	@Override
	public boolean land() {
		System.out.println("Airplane landed");
		return true;
	}

	@Override
	public boolean fly() {
		System.out.println("Aiplane is fly");
		return true;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(size, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		return Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

	@Override
	public String toString() {
		return "Airplane [size=" + size + ", speed=" + speed + "]";
	}
	
}
