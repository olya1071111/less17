package com.itacademy.less18.main;

import java.util.Objects;

public class Player {
	private String possibility;

	
	public String getPossibility() {
		return possibility;
	}

	public void setPossibility(String possibility) {
		this.possibility = possibility;
	}

	@Override
	public int hashCode() {
		return Objects.hash(possibility);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(possibility, other.possibility);
	}
	
	
	
}
