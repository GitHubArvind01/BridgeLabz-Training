package com.tree.musicapp;

public class MusicApp {
	Music root;
	
	//add music
	public void addMusic(int trackId, String title) {
		Music newMusic = new Music(trackId, title);
		root = insert(root, newMusic);
	}

	public Music insert(Music root, Music newMusic) {
		if(root==null) {
			System.out.println("Song added.");
			return root = newMusic;
		}
		
		if(root.getTitle().compareToIgnoreCase(newMusic.getTitle())>0) {
			root.setLeft(insert(root.getLeft(),newMusic));
		}
		
		else if(newMusic.getTitle().compareToIgnoreCase(root.getTitle())>0) {
			root.setRight(insert(root.getRight(),newMusic));
		}
		return root;
	}
	
	
	//view music
	public void viewAllMusic() {
		Music temp = root;
		view(temp);
	}
	private void view(Music curr) {
		if(curr==null) {
			return;
		}
		
		view(curr.getLeft());
		System.out.println(curr.toString());
		view(curr.getRight());
	}
	
	//searchMusicByTitle
	public void searchMusicByTitle(String title) {
		Music temp = root;
		if(!search(temp,title)) {
			System.out.println("Music not found!");
		}
	}
	private boolean search(Music curr, String title) {
		if(curr==null) {
			return false;
		}
		
		if(curr.getTitle().equalsIgnoreCase(title)) {
			System.out.println("Found");
			System.out.println(curr.toString());
			return true;
		}
		return search(curr.getLeft(),title) || search(curr.getRight(),title);
	}
}
