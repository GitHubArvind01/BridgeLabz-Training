import java.util.Scanner;
import java.util.Random;

public class FestivalLuckyDraw{
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	static String[] gifts = {"Candy","Laptop","Gaming PC","2LAKH","Water bottle","Mobile Charger","Iphone 16 Pro","NoteBook","Headphone","Game Pad"};
	public static void main(String args[]){
		
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("Want to Play Lucky Game-> please enter 'P' : ");
			System.out.println("For exit Game-> press 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			switch(c){
				case 'P':
					//call method to playLuckyDraw
					playLuckyDraw();
					break;
				default:
					System.out.println("Invalid input!");
					break;
			}
		}
	}
	
	//this method play the lucky draw game -
	public static void playLuckyDraw(){
		int randomNumber = random.nextInt(100);
		
		if(randomNumber%3==0 && randomNumber%5==0){
			System.out.println("------------------Congratulation--------------------");
			System.out.println("You won the lucky draw game -> lucky number is: " + randomNumber);
			System.out.println("You won gift -> " + randomGift());
			System.out.println("--------------------------------------------");
		}else{
			System.out.println("------------------Sorry!--------------------");
			System.out.println("Better luck next time! your lucky number is " + randomNumber);
			System.out.println("--------------------------------------------");
		}
	}
	
	public static String randomGift(){
		int randomIdx = random.nextInt(10);
		return gifts[randomIdx];
	}
}