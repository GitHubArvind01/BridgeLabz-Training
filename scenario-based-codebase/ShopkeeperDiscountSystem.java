
import java.util.Scanner;
public class ShopkeeperDiscountSystem{
	static String groceryItem[] = {"Rice","Flour","Oats","Sugar","Salt"};
	static int groceryPrice[] = {50,35,200,50,29};
	static double totalBill = 0.0;
		
	public static void showItem(){
		for(int i=0;i<groceryPrice.length;i++){
			System.out.println("---------Enter the Choise--------");
			System.out.println("Item-> "+groceryItem[i]);
			System.out.println("Price-> "+groceryPrice[i]);
			System.out.println("Add to cart press -> " + (i+1));
			System.out.println("---------------------------------");
		}
	}
	
	public static void cart(int i, int q){
		if(i<0 || i>10){
			System.out.println("Enter wrong number to add in cart");
			return;
		}
		else{
			totalBill+=groceryPrice[i-1]*q;
		}
	}
	
	public static void finalBill(){
		if(totalBill>=1000&& totalBill<5000){
			double discount = (totalBill*0.05);
			System.out.println("The amount is: "+totalBill);
			System.out.println("The discount amount is: "+ discount);
			System.out.println("------------------------------------------------------");
			System.out.println("The final bill amount after discount is:  "+(totalBill-discount));
			System.out.println("------------------------------------------------------");
			return;
		}
		else if(totalBill>=5000&& totalBill<10000){
			double discount = (totalBill*0.10);
			System.out.println("The amount is: "+totalBill);
			System.out.println("The discount amount is: "+ discount);
			System.out.println("------------------------------------------------------");
			System.out.println("The final bill amount after discount is:  "+(totalBill-discount));
			System.out.println("------------------------------------------------------");
			return;
		}
		else if(totalBill>=10000&& totalBill<50000){
			double discount = (totalBill*0.15);
			System.out.println("The amount is: "+totalBill);
			System.out.println("The discount amount is: "+ discount);
			System.out.println("------------------------------------------------------");
			System.out.println("The final bill amount after discount is:  "+(totalBill-discount));
			System.out.println("------------------------------------------------------");
			return;
		}
		else if(totalBill>=50000&& totalBill<100000){
			double discount = (totalBill*0.20);
			System.out.println("The amount is: "+totalBill);
			System.out.println("The discount amount is: "+ discount);
			System.out.println("------------------------------------------------------");
			System.out.println("The final bill amount after discount is:  "+(totalBill-discount));
			System.out.println("------------------------------------------------------");
			return;
		}
		else if(totalBill>100000){
			double discount = (totalBill*0.25);
			System.out.println("The amount is: "+totalBill);
			System.out.println("The discount amount is: "+ discount);
			System.out.println("------------------------------------------------------");
			System.out.println("The final bill amount after discount is:  "+(totalBill-discount));
			System.out.println("------------------------------------------------------");
			return;
		}
		else{
			double discount = 0;
			System.out.println("The amount is: "+totalBill);
			System.out.println("The discount amount is: "+ discount);
			System.out.println("------------------------------------------------------");
			System.out.println("The final bill amount after discount is:  "+(totalBill-discount));
			System.out.println("------------------------------------------------------");
			return;
		}
	}
	public static void main(String args[]){
		//scanner class for taking input
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("---------Enter the Option--------");
			System.out.println("For Show Menu list -> 'S': ");
			System.out.println("For Final Bill amount -> 'B': ");
			System.out.println("For View Cart amount-> 'V': ");
			System.out.println("---------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='S'){
				showItem();
				System.out.println("Enter the number to add cart: ");
				int i = sc.nextInt();
				
				System.out.println("Enter the quantity: ");
				int q = sc.nextInt();
				cart(i,q);
			}
			
			if(c=='V'){
				System.out.println("Total cart item amount is: "+ totalBill);
			}
			if(c=='B'){
				finalBill();
				System.out.println("Thanks for shoping!");
				break;
			}
		}
	}
}