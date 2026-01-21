package com.question.gamerzone;

public class Main {

	public static void main(String[] args) {
		Game[] game = {new Game("Rocky",392), new Game("ravi",92), new Game("sunny",39), new Game("allu",1392), new Game("shiva",192)};
		
		quickSort(game,0,game.length-1);
		
		//display
		for(Game g: game) {
			System.out.println("\nPlayer Name"+g.playerName);
			System.out.println("Score: "+g.score);
		}
	}
	
	//quick
	public static void quickSort(Game game[], int start, int end) {
		if(start>=end) {
			return;
		}
		int i=start-1;
		int j = start;
		Game pivot = game[end];
		while(j<end) {
			if(game[j].score<=pivot.score) {
				i+=1;
				//swap
				swap(game,i,j);
			}
			j+=1;
		}
		
		i+=1;
		//swap
		swap(game,i,j);
		
		quickSort(game,i+1,end);
		quickSort(game,start,i-1);
	}
	
	public static void swap(Game game[], int i, int j) {
		Game temp = game[i];
		game[i] = game[j];
		game[j] = temp;
	}
}