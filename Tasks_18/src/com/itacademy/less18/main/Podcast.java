package com.itacademy.less18.main;

import java.util.Objects;

public class Podcast extends File implements Playable {

	public Podcast(String name, double size) {
		super(name, size);
	}

	private double length;

	@Override
	public boolean play() {
		System.out.println("Подкаст запись запустилась");
		return true;
	}

	@Override
	public boolean pause() {
		System.out.println("Подкаст запись на паузе");
		return true;
	}

	@Override
	public boolean stop() {
		System.out.println("Подкаст запись на паузе ");
		return true;
	}

	@Override
	public boolean rewind() {
		System.out.println("Подкаст запись на перемотке ");
		return true;

	}

	public double getLengthMin() {
		return length;
	}

	public void setLengthMin(double lengthMin) {
		this.length = lengthMin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(length);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Podcast other = (Podcast) obj;
		return Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length);
	}

}
