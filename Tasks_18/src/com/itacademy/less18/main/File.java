package com.itacademy.less18.main;

import java.util.Objects;

public abstract class File implements Playable {
	private double size;
	private String name;

	public File(String name, double size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public abstract boolean play();

	@Override
	public abstract boolean pause();

	@Override
	public abstract boolean stop();

	@Override
	public abstract boolean rewind();

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		return Objects.equals(name, other.name) && Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size);
	}

	@Override
	public String toString() {
		return "File [size=" + size + ", name=" + name + "]";
	}
	
}
