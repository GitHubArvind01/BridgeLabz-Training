package com.OopsScenarioBased.bagballorganizer;

public class Ball {
	static int count = 1001;
	private int ballId;
	private String ballColor;
	private String ballSize;
		
	public Ball(String ballColor, String ballSize) {
		this.ballId = count++;
		this.ballColor = ballColor;
		this.ballSize = ballSize;
	}

	public int getBallId() {
		return ballId;
	}

	public String getBallColor() {
		return ballColor;
	}

	public String getBallSize() {
		return ballSize;
	}	
}