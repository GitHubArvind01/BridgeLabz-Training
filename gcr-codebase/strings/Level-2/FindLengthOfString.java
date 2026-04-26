import java.util.Scanner;
//Create FindLengthOfString Class to compute the length of the string
public class FindLengthOfString{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as str from user
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		//calling function to compare both string
		int result = countLength(str);
		
		//displaying the ouput
		System.out.println("The length of string is : "+ result);
	}
	public static int countLength(String str){
		int len = str.length();
		int count = 0;
		
			try{
				int i=0;
				while(true){
				str.charAt(count++);
					
				}
			}catch(Exception e){
				
			}finally{
				return count-1;
			}
	}
}