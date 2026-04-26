package com.OopsScenarioBased.artify;
import java.util.*;

public class Main {
	static User users;
	static Scanner sc = new Scanner(System.in);
	static int countUser = 0;
	public static void main(String[] args) {
		
		ArtManagement management = new ArtManagement();
		
		//here work start
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("Sell Art-> enter 'S' : ");
			System.out.println("Buy Art-> enter 'B' : ");
			System.out.println("View All Art-> enter 'V': ");
			System.out.println("View balance-> enter 'A': ");
			System.out.println("For exit quiz -> enter 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			sc.nextLine();
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c){
				case 'S':
					System.out.println("Please Enter the art title: ");
					String title = sc.nextLine();
					
					System.out.println("Please Enter artist name: ");
					String artistName = sc.nextLine();
					
					System.out.println("Please Enter the art price: ");
					double artPrice = sc.nextDouble();
					sc.nextLine();
					
					System.out.println("Please Enter the license type: ");
					String licenseType = sc.nextLine();
					
					System.out.println("----Chose Art type-----");
					System.out.println("Print Art -> enter 'P' : ");
					System.out.println("Digital Art -> enter 'D' : ");
					
					char artType = sc.next().charAt(0);
					artType = Character.toUpperCase(artType);
					sc.nextLine();
					
					if(artType!='P' && artType!='D') {
						System.out.println("Wrong input!");
						break;
					}
					if(artType=='P') {
						Artwork printWork = new PrintArt(title, artistName, artPrice, licenseType);
						management.addArts(printWork);
						break;
					}
					if(artType=='D') {
						Artwork digitalWork = new PrintArt(title, artistName, artPrice, licenseType);
						management.addArts(digitalWork);
						break;
					}
					break;
				case 'B':
					System.out.println("Please Enter the art title to buy: ");
					String  artTitle = sc.nextLine();
					
					if(countUser>0) {
						if(users.getWalletBalance()==0) {
							System.out.println("Please Enter your balance: ");
							double tempbalance = sc.nextDouble();
							sc.nextLine();
							users.setWalletBalance(tempbalance);
						}
						
						users = new User(users.getName(),users.getWalletBalance());
						management.purchase(users, artTitle);
						break;
					}
					
					System.out.println("Please Enter your name: ");
					String name = sc.nextLine();
					
					
					System.out.println("Enter your balance: ");
					double newBalance = sc.nextDouble();
					users = new User(name,newBalance);
					management.purchase(users, artTitle);
					countUser+=1;
					break;
				case 'V':
					management.viewArts();
					break;
				case 'A':
					if(users!=null) {
						management.viewBalance(users);
					}else {
						System.out.println("User not available ");
					}
					break;
				default:
					System.out.println("Invalid input!");
			}
		}
	}
}
