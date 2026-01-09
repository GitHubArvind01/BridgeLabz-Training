package com.OopsScenarioBased.artify;
import java.util.*;

public class ArtManagement {
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
					double tempPrice = works.getPrice();
					user.setWalletBalance((user.getWalletBalance()-tempPrice));
					artList.remove(works);
					System.out.println(title+" art buy Success.");
					return;
				}else {
					System.out.println("Amout not sufficient to buy!");
					return;
				}
			}
		}
		System.out.println("Title not found!");
	}
	
	//user can see their
	public void viewBalance(User users) {
		System.out.println("Wallet Balance: "+users.getWalletBalance());
	}
}
