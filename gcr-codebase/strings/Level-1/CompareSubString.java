import java.util.Scanner;
//Create CompareSubString Class to check the substring equal or not
public class CompareSubString{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as str from user
		System.out.println("Enter the string: ");
		String str = sc.next();
		
		System.out.println("Enter the start index: ");
		int start = sc.nextInt();

		System.out.println("Enter the end index: ");
		int end = sc.nextInt();
		
		//calling function computeSubString
		String str1 = computeSubString(str,start,end);
		
		//calling function builtSubString
		String str2 = builtSubString(str,start,end);
		
		//calling function compareSubstring
		compareSubstring(str1,str2);
	}
	public static String computeSubString(String str, int st, int end){
		String newSubstring = "";
		for(int i=st;i<end;i++){
			newSubstring+=str.charAt(i);
		}
		return newSubstring;
	}
	
	public static String builtSubString(String str, int st, int end){
		return str.substring(st,end);
	}
	
	public static void compareSubstring(String str1, String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		boolean f1 = true;
		if(len1!=len2){
			f1 = false;
		}else{
			for(int i=0;i<len1;i++){
				if(str1.charAt(i)!=str2.charAt(i)){
					f1 = false;
					break;
				}
			}
		}
		if(f1){
			System.out.println("Both substring equal!");
		}else{
			System.out.println("Both substring not equal!");
		}
	}
}