package com.OopsScenarioBased.artify;
import java.util.*;

public class ArtManagement implements IPurchasable{
	//this  class manage both buyer and seller
	//User
	static List<Artwork> artList = new ArrayList<>();
	
	//add art 
	public void addArts(Artwork newArts) {
		artList.add(newArts);
		System.out.println("Art added");
	}
	
	//remove art
	public void removeArts(Artwork newArts) {
		if(artList.contains(newArts)) {
			artList.remove(newArts);
			System.out.println("Art removed!");
			return;
		}
		System.out.println("Art not found!");
	}
	
	//view arts
	public void viewArts() {
		int i=1;
		System.out.println("-------------------------Art list-----------------------------");
		for(Artwork works: artList) {
			System.out.println("-----------Art"+(i)+"--------------");
			System.out.println("Title: "+works.getTitle());
			System.out.println("Artist name: "+works.getArtist());
			System.out.println("Price: "+works.getPrice());
			System.out.println("License type: "+works.getLicenseType());
			System.out.println("-------------------------");
			i+=1;
		}
		System.out.println("--------------------------------------------------------------");
	}
	
	
	//buy art
	public void purchase(User user, String title) {
		for(Artwork works:artList) {
			if(works.getTitle().equalsIgnoreCase(title)) {
				if(works.getPrice()<=user.getWalletBalance()) {
					double tempPrice = works.getPrice(); //artist price 
					double userwalletAmount = user.getWalletBalance(); //user wallet amount
					
					System.out.println(title+" art buy Success.");
					System.out.println("Art price "+tempPrice);
					
					user.setWalletBalance((userwalletAmount-tempPrice)); 
					if(works.getLicenseType().equalsIgnoreCase("Exclusive")) {
						double discount = license(works.getPrice());
						user.setWalletBalance(user.getWalletBalance()+discount);
						
						System.out.println("Discount you got : "+discount);
						System.out.println("Total art price: "+(tempPrice-discount));
					}
					artList.remove(works);
					return;
				}else {
					System.out.println("Amout not sufficient to buy!");
					return;
				}
			}
		}
		System.out.println("Title not found!");
	}
	
	//another license
	public double license(double price) {
		//get discount by license
		return (price*0.1);
	}
	
	//user can see their
	public void viewBalance(User users) {
		System.out.println("Wallet Balance: "+users.getWalletBalance());
	}
}
