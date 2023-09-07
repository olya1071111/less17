package com.itacademy.less17_2.main;

import java.util.Objects;

public class CurrentAccount extends Account {
	private double overdraftLimit;

	CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public double withdraw(double sum) {
		double tempBalance = getBalance() - sum;
		if ((tempBalance < 0) || (sum > overdraftLimit)) {
			throw new RuntimeException("Uncorrect balance or Exceeded the limit");
		} else {
			setBalance(tempBalance);
			return tempBalance;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(overdraftLimit);
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
		CurrentAccount other = (CurrentAccount) obj;
		return Double.doubleToLongBits(overdraftLimit) == Double.doubleToLongBits(other.overdraftLimit);
	}

	@Override
	public String toString() {
		return "CurrentAccount: " + "AccountNumber = " + getAccountNumber() + " Balance = " + getBalance() + " OverdraftLimit= "
				+ overdraftLimit + "]";
	}

}
