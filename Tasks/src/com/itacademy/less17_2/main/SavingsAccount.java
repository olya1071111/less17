package com.itacademy.less17_2.main;

import java.util.Objects;

public class SavingsAccount extends Account {
	private double interestRate;
	private int depositMonth;

	public SavingsAccount(int accountNumber, double balance, double interestRate, int depositMonth) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
		this.depositMonth = depositMonth;
	}

	public int getDepositMonth() {
		return depositMonth;
	}

	public void setDepositMonth(int depositMonth) {
		this.depositMonth = depositMonth;
	}

	public void addInterest() {
		double newBalance = getBalance() + getBalance() * interestRate * depositMonth / 100.0;
		setBalance(newBalance);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(depositMonth, interestRate);
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
		SavingsAccount other = (SavingsAccount) obj;
		return depositMonth == other.depositMonth
				&& Double.doubleToLongBits(interestRate) == Double.doubleToLongBits(other.interestRate);
	}

	@Override
	public String toString() {
		return "SavingsAccount: " + "AccountNumber = " + getAccountNumber() + " Balance = " + getBalance() + " InterestRate = "
				+ interestRate + " depositMonth = " + depositMonth + "]";
	}

}
