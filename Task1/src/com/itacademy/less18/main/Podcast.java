package com.itacademy.less18.main;

import java.util.Objects;

public class Podcast extends Player implements Options {
	private double lengthMin;

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
		return lengthMin;
	}

	public void setLengthMin(double lengthMin) {
		this.lengthMin = lengthMin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lengthMin);
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
		return Double.doubleToLongBits(lengthMin) == Double.doubleToLongBits(other.lengthMin);
	}

}
