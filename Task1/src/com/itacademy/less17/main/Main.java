package com.itacademy.less17.main;

public class Main {

	public static void main(String[] args) {
		Animal animal = null;
		int x = (int) (Math.random() * 100);
		System.out.println(x);
		if (x < 20) {
			animal = new Cat();
		} else if (20 <= x && x < 70) {
			animal = new Cow();
		} else if (70 <= x && x < 100) {
			animal = new Dog();
		}
		animal.sound();
	}

}
