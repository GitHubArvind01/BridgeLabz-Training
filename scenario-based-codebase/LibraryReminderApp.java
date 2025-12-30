import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LibraryReminderApp{
	//book list to store five book 
	static String[] bookList = {"Automic Habits","Rich Dad and Poor Dad","Think Rich and Grow Rich","The power of your subconscious mind","The psychology of money"};
	static int[] bookFine = new int[5];
	static String[] bookStatus = {"NO","NO","NO","NO","NO"};
	
	static int returnBookCount = 5;
	public static void main(String args[]){
		//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("\n----------------Choose Option--------------");
			System.out.println("For show all Book-> enter 'S' : ");
			System.out.println("For Return Book-> enter 'R' : ");
			System.out.println("For View Fine-> enter 'V' : ");
			System.out.println("For exit -> press 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(returnBookCount==0){
				System.out.println("----------All Book Returned-----------");
				break;
			}
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			//switch will work
			switch(c){
				case 'S':
					//call showAllBook method
					showAllBook();
					break;
				case 'R':
					//call the method to show all moive type 
					showAllBook();
					//call the showAllBook to show all book and ask user chose which book want to return
					System.out.println("|-----------------------------------------------|");
					System.out.println("Choose -> please enter book number to return: ");
					System.out.println("|-----------------------------------------------|");
					int bookNumber = sc.nextInt();
					if(bookNumber<0 || bookNumber>5){
						System.out.println("Invalid Book Number! -> please enter correct book number to return: ");
						break;
					}
					
					//ask user to enter the due date
					System.out.println("|--------------------------------------------------|");
					System.out.println("Enter -> Due Date of Book like - DD-MM-YYYY: ");
					System.out.println("|--------------------------------------------------|");
					String dueDate = sc.next();
					
					//ask user to enter the return date
					System.out.println("|--------------------------------------------------|");
					System.out.println("Enter -> return Date of Booklike - DD-MM-YYYY: ");
					System.out.println("|--------------------------------------------------|");
					String returnDate = sc.next();
					
					//call the method to book the ticket
					fineCalcualte(bookNumber,dueDate,returnDate);
					break;
				case 'V':
					//call the viewBookFineAndStatus method
					viewBookFineAndStatus();
					break;
				default:
					System.out.println("Invalid input! ");
			}
		}
	}
	//this method show all book
	public static void showAllBook(){
		System.out.println("--------------------------------------------------------");
		System.out.println("Book Number.\t\tBook Name");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+"\t\t\t"+bookList[i]);
		}
		System.out.println("-------------------------------------------------------");	
	}
	
	
	//this method calculate the book fine
	public static void fineCalcualte(int bookNumber, String dueDate, String returnDate){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate d1 = LocalDate.parse(dueDate, formatter);
        LocalDate d2 = LocalDate.parse(returnDate, formatter);
		long days = ChronoUnit.DAYS.between(d1, d2);
		
		if(days>0){
			bookFine[bookNumber-1] = (int)(days*5);
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Fine -> "+bookFine[bookNumber-1] + " added of book: " + bookList[bookNumber-1]);
			System.out.println("---------------------------------------------------------------------------");
			bookStatus[bookNumber-1] = "YES";
		}
		returnBookCount-=1;
	}
	
	// this method shows the Book Fine
	public static void viewBookFineAndStatus(){
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.printf("%-12s %-40s %-15s %-15s%n","Book Number","Book Name","Fine", "Return Status");
		System.out.println("---------------------------------------------------------------------------------------");

		for(int i = 0; i < 5; i++){
			System.out.printf("%-12d %-40s %-15d %-15s%n",(i+1), bookList[i], bookFine[i],bookStatus[i]);
		}

		System.out.println("---------------------------------------------------------------------------------------");
	}

}