import java.util.Scanner;
public class CalculatePrice{
	public static void main (String args[]){
		
		//Here Scanner object created to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking height as input from user
		System.out.println("Enter the price of an item: ");
		int priceOfItem = sc.nextInt();
		
		System.out.println("Enter the quantity of bought: ");
		int quantityBought= sc.nextInt();		
		
		//calculating the side of parameter
		int price = quantityBought*priceOfItem;
		
		//Displaying the output
		System.out.println("The total purchase price is INR "+ price +" if the quantity "+ quantityBought +" and unit price is INR "+priceOfItem);
	}
}