import java.util.Scanner;
//Create CountVowelAndConstant Class to compute the vowel and constant count
public class CountVowelAndConstant{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as str from user
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		//calling function to countVandC
		int result[] = countVandC(str);
		
		//displaying the ouput
		System.out.println("The length of vowel is : "+ result[0]);
		System.out.println("The length of constant is : "+ result[1]);
	}
	public static int[] countVandC(String str){
		int len = str.length();
		int countV = 0;
		int countC = 0;
		for(int i=0;i<len;i++){
			char c = str.charAt(i);
			
			if((int)c>=65 && (int)c<92){
				char v = (char)(c+32);
				if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u'){
					countV++;
				}else{
					countC++;
				}
			}else{
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
					countV++;
				}else{
					countC++;
				}
			}
		}
		
		return new int[]{countV,countC};
	}
}	