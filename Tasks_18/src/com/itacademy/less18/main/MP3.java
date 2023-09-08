package com.itacademy.less18.main;

import java.util.Objects;

public class MP3 extends File implements Playable {

	public MP3(String name, double size) {
		super(name, size);
	}

	private double size;

	@Override
	public boolean play() {
		System.out.println("MP3 запись запустилась");
		return true;
	}

	@Override
	public boolean pause() {
		System.out.println("MP3 запись на паузе");
		return true;
	}

	@Override
	public boolean stop() {
		System.out.println("MP3 запись на паузе ");
		return true;
	}

	@Override
	public boolean rewind() {
		System.out.println("MP3 запись на перемотке ");
		return true;

	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MP3 other = (MP3) obj;
		return Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size);
	}

}
