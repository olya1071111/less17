package com.itacademy.less17_2.main;

public class Main {
	public static void main(String[] args) {
		Account account = new Account(1, 520);
		CurrentAccount curAccount = new CurrentAccount(2, 340, 300);
		SavingsAccount saveAccount = new SavingsAccount(3, 450, 2, 12);

		account.deposite(500);
		System.out.println(account.toString());

		try {
			account.withdraw(5000);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		account.withdraw(200);
		System.out.println(account);

		curAccount.deposite(50);
		System.out.println(curAccount);

		try {
			curAccount.withdraw(210);
			System.out.println(curAccount);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		saveAccount.withdraw(50);
		System.out.println(saveAccount);
		
		saveAccount.addInterest();
		System.out.println(saveAccount);
		

	}
}
