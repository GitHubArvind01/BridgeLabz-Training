import java.util.*;
public class SubString{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input from user 
		String str = sc.next();
		String sub = sc.next();
		
		System.out.println("The occurence of the substring is "+checkOccurence(str,sub));
	}
	//This method find the occurence of substring
	public static int checkOccurence(String s, String sub){
		int len = 0;
		for(int i=0;i<s.length();i++){
			for(int j =i;j<=s.length();j++){
				String str = s.substring(i,j);
				if(str.equals(sub)){
					len++;
				}
			}
		}
		return len;
	}
}