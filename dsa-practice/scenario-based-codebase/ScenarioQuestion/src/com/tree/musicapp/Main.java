package com.tree.musicapp;

public class Main {

	public static void main(String[] args) {
		MusicApp app = new MusicApp();
		app.addMusic(101, "RRR Songs");
		app.addMusic(102, "Kabhi kabhi Songs");
		app.addMusic(103, "Tere liye mera Songs");
		app.addMusic(104, "Brown rang Songs");
		app.addMusic(105, "Blue eyes Songs");
		
		app.viewAllMusic();
		
		app.searchMusicByTitle("Blue eyes Songs");
	}
}