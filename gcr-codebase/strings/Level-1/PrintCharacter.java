import java.util.Scanner;
//Create PrintCharacter Class to compute the character from string and validate then print
public class PrintCharacter{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as str from user
		System.out.println("Enter the string: ");
		String str = sc.next();
		
		//calling function computeSubString1
		char c1[] = computeCharacter1(str);
		
		//calling function computeCharacter2
		char c2[] = computeCharacter2(str);
		
		//Displaying character
		System.out.println("String character: ");
		for(int i=0;i<c2.length;i++){
			System.out.println(c2[i]);
		}
		
		//calling function compareCharacter
		compareCharacter(c1,c2);
	}
	public static char[] computeCharacter1(String str){
		char c1[] = new char[str.length()];
		for(int i=0;i<str.length();i++){
			c1[i] = str.charAt(i);
		}
		return c1;
	}
	
	public static char[] computeCharacter2(String str){
		return str.toCharArray();
	}
	
	public static void compareCharacter(char c1[], char c2[]){
		int len1 = c1.length;
		int len2 = c2.length;
		
		boolean f1 = true;
		if(len1!=len2){
			f1 = false;
		}else{
			for(int i=0;i<len1;i++){
				if(c1[i]!=c2[i]){
					f1 = false;
					break;
				}
			}
		}
		if(f1){
			System.out.println("Both String character equal!");
		}else{
			System.out.println("Both String character not equal!");
		}
	}
}