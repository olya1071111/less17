package com.itacademy.less18.main;

import java.util.Objects;

public class Video extends Player implements Options {
	private double size;
	private int resolution;

	@Override
	public boolean play() {
		System.out.println("Video запись запустилась");
		return true;
	}

	@Override
	public boolean pause() {
		System.out.println("Video запись на паузе");
		return true;
	}

	@Override
	public boolean stop() {
		System.out.println("Video запись на паузе ");
		return true;
	}

	@Override
	public boolean rewind() {
		System.out.println("Video запись на перемотке ");
		return true;

	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	@Override
	public int hashCode() {
		return Objects.hash(resolution, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		return resolution == other.resolution && Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size);
	}

}
