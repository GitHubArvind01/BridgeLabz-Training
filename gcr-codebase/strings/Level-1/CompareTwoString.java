import java.util.Scanner;
//Create CompareTwoString Class to check the two string equal or not
public class CompareTwoString{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as str1 and str2 from user
		System.out.println("Enter the first text: ");
		String str1 = sc.next();
		
		System.out.println("Enter the second text: ");
		String str2 = sc.next();
		
		//validating the string by charAt
		boolean f1 = true;
		if(str1.length()!=str2.length()){
			f1 = false;
		}else{
			for(int i=0;i<str1.length();i++){
				if(str1.charAt(i)!=str2.charAt(i)){
					f1 = false;
					break;
				}
			}
		}
		
		//validating the string by bult in method
		boolean f2 = str1.equals(str2);
		System.out.println(f1);
		System.out.println(f2);
		//Displaying the ouput
		if(f1==true && f2==true){
			System.out.println("Str1 " + str1+ " And Str2 "+ str2 +" equals!");
		}else{
			System.out.println("Str1 " + str1+ " And Str2 "+ str2 +" not equals!");
		}
	}
}