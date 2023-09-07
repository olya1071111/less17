package com.itacademy.less18.main;

public class Main {
	public static void main(String args[]) {
		Options option;

		option = new MP3();
		option.play();
		option.stop();
		System.out.println();

		option = new Video();
		option.pause();
		option.rewind();
		System.out.println();

		option = new Podcast();
		option.play();
		option.rewind();
	}

}
