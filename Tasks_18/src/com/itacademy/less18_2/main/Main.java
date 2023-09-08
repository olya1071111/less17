package com.itacademy.less18_2.main;

public class Main {

	public static void main(String[] args) {
		Flyable object;

		object = new Bird("eagle", 3);
		object.fly();
		object.land();
		System.out.println();

		object = new Airplane(4, 55);
		object.takeOff();
		object.land();
		System.out.println();

		object = new Drone("ML-4675", 0.4, 70);
		object.takeOff();
		object.fly();

	}

}
