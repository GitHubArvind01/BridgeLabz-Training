import java.util.*;
public class FindGCDAndLCM {
    public static void main(String[] args) {
		
        // Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input from user 
        int number = sc.nextInt();
        int s = sc.nextInt();

        System.out.println("The GCD is " + FindGCD(number, s));
        System.out.println("The LCM is " + FindLCM(number, s));

    }
	//This method solve GCD
    public static int FindGCD(int n, int s) {
        while (s != 0) {
            int temp = s;
            s = n % s;
            n = temp;
        }
        return n;
    }
	//This method solve LCM
    public static int FindLCM(int n, int s) {
        return (n * s) / gcd(n, s);
    }
}