
import java.util.Scanner;
public class ShopkeeperDiscountSystem{
	public void showItem(String item[], int price[]){
		for(int i=0;i<price.length;i++){
			System.out.println("--------------------");
			System.out.println("Item-> "+item[i]);
			System.out.println("Price-> "+price[i]);
			System.out.
			System.out.println("--------------------");
		}
	}
	public static void main(String args[]){
		//scanner class for taking input
		Scanner sc = new Scanner(System.in);
		
		String groceryItem[] = {"Rice","Flour","Oats","Sugar","Salt"};
		int groceryPrice[] = {50,35,200,50,29};
		
		
		double totalBill = 0.0;
		
		while(true){
			System.out.println("---------Enter the Choise--------");
			System.out.println("For Grocery Item -> 'G': ");
			System.out.println("For Dairy Item -> 'D': ");
			System.out.println("For End Shoping-> 'E': ");
			System.out.println("---------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(
		}
	}
}