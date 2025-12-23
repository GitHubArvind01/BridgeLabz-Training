import java.util.Scanner;
//Create ReverseString Class to reverse the string
public class ReverseString{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as str from user
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		//calling function to convertReverse
		String reverse = convertReverse(str);
		
		//displaying the ouput
		System.out.println("Reverse string is : "+ reverse);	
	}
	public static String convertReverse(String str){
		int len = str.length();
		String reverseStr = "";
		for(int i=len-1;i>=0;i--){
			reverseStr+=str.charAt(i);
		}
		return reverseStr;
	}
}	