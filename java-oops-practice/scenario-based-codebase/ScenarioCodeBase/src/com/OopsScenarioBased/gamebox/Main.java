package com.OopsScenarioBased.gamebox;

public class Main {

	public static void main(String[] args) {
		Game game1 = new StrategyGame("Dot game","Action",1200,7.5);
		Game game2 = new StrategyGame("Fight Game","Thrill",1200,9.5);
		Game game3 = new StrategyGame("Animal Game","Comedy",100,4.5);
		game1.download();
		
		User aman = new User();
		aman.addGame(game1);
		aman.addGame(game2);
		aman.addGame(game1);

		aman.viewGame();
	}
}