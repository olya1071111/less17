package com.itacademy.less17_3.main;

import java.util.Objects;

public class TennisPlayer extends Player {
	private int number;

	public TennisPlayer(String sportType, String name, int number) {
		super(sportType, name);
		this.number = number;
	}

	public void play() {
		int x = (int) (Math.random() * 100);
		if (x < 20) {
			System.out.println("Serves the ball");
		} else if (20 <= x && x < 50) {
			System.out.println("Repelled the opponent's attack");
		} else if (50 <= x && x < 70) {
			System.out.println("Scored a point!");
		} else if (70 <= x && x < 100) {
			System.out.println("Hit the ball out of bounds.");
		}
		System.out.println();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(number);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TennisPlayer other = (TennisPlayer) obj;
		return number == other.number;
	}

	@Override
	public String toString() {
		return getName() + ", number - " + number;
	}

}
