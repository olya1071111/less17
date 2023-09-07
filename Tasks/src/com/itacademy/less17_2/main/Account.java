package com.itacademy.less17_2.main;

import java.util.Objects;

public class Account {
	private int accountNumber;
	private double balance;

	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double deposite(double sum) {
		balance = balance + sum;
		return balance;
	}

	public double withdraw(double sum) {
		double tempBalance = balance - sum;
		if (tempBalance < 0) {
			throw new RuntimeException("Uncorrect balance");
		} else {
			balance = tempBalance;
			return balance;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, balance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountNumber == other.accountNumber
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

}
