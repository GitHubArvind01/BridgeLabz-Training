import java.util.Scanner;
// Create FindLengthOfLongestSentence Class to compute the longest length of string
public class FindLengthOfLongestSentence{

    public static void main(String args[]) {
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input from user 
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		
		//calling method findLength
		String longestString = longestLength(str);
		
		//display output
		System.out.println("Longest length of sentence is : " + longestString);
    }

    // Method to calculate the length of string without using built-in-method
	public static String longestLength(String str){
		String[] words = str.split(" "); 

        String longestWord = "";

        for (String word : words) {
            // Optional: remove punctuation for a more accurate word length comparison
            // word = word.replaceAll("[^a-zA-Z]", ""); 

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
	}
}