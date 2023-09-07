package com.itacademy.less17_3.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		FootballPlayer FootballPlayer1 = new FootballPlayer("Football", "Ivanov", 12);
		FootballPlayer FootballPlayer2 = new FootballPlayer("Football", "Petrov", 32);

		BasketballPlayer BasketballPlayer1 = new BasketballPlayer("Basketball", "Popov", 41);
		BasketballPlayer BasketballPlayer2 = new BasketballPlayer("Basketball", "Talov", 24);

		TennisPlayer TennisPlayer1 = new TennisPlayer("Tennis", "Tatarinov", 84);
		TennisPlayer TennisPlayer2 = new TennisPlayer("Tennis", "Kozlov", 79);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in the range from 1 to 3 (1 - Football, 2 - Basketball, 3 - Tennis)");
		System.out.print("> ");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println(FootballPlayer1.getSportType()+":");
			System.out.println(FootballPlayer1);
			FootballPlayer1.play();
			System.out.println(FootballPlayer2);
			FootballPlayer2.play();
			break;
		case 2:
			System.out.println(BasketballPlayer1.getSportType()+":");
			System.out.println(BasketballPlayer1);
			BasketballPlayer1.play();
			System.out.println(BasketballPlayer2);
			BasketballPlayer2.play();
			break;
		case 3:
			System.out.println(TennisPlayer1.getSportType()+":");
			System.out.println(TennisPlayer1);
			TennisPlayer1.play();
			System.out.println(TennisPlayer2);
			TennisPlayer2.play();
		}
	}
}
