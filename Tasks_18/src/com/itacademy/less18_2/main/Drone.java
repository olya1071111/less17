package com.itacademy.less18_2.main;

import java.util.Objects;

public class Drone implements Flyable {
	private String model;
	private double size;
	private double speed;

	public Drone(String model, double size, double speed) {
		this.model = model;
		this.size = size;
		this.speed = speed;
	}

	@Override
	public boolean takeOff() {
		System.out.println("Drone is take of.");
		return true;
	}

	@Override
	public boolean land() {
		System.out.println("Drone landed");
		return true;
	}

	@Override
	public boolean fly() {
		System.out.println("Drone is fly");
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, size, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drone other = (Drone) obj;
		return Objects.equals(model, other.model)
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

	@Override
	public String toString() {
		return "Drone [model=" + model + ", size=" + size + ", speed=" + speed + "]";
	}

}
