import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int y = sc.nextInt();

        System.out.println("The sum of "+ x + " and " + y + " is : "+ (x+y));
    }
}
