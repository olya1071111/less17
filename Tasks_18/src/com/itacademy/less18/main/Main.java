package com.itacademy.less18.main;

public class Main {
	public static void main(String args[]) {
		Playable option;
		
		option = new MP3("1.mp3", 58);
		option.play();
		option.stop();
		System.out.println();

		option = new Video("2.mp4", 721);
		option.pause();
		option.rewind();
		System.out.println();

		option = new Podcast("3.avi", 254);
		option.play();
		option.rewind();
	}

}
