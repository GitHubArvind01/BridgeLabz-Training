package com.tree.musicapp;

public class Music {
	private int trackId;
	private String title;
	
	private Music left, right;

	public Music(int trackId, String title) {
		this.trackId = trackId;
		this.title = title;
		left = null;
		right = null;
	}

	public int getTrackId() {
		return trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Music getLeft() {
		return left;
	}

	public void setLeft(Music left) {
		this.left = left;
	}

	public Music getRight() {
		return right;
	}

	public void setRight(Music right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Music [trackId=" + trackId + ", title=" + title + "]";
	}
}
