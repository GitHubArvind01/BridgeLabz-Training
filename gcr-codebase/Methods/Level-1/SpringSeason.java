//Create SpringSeason Class to compute that month and year is spring season or not
public class SpringSeason{
	public static void main (String args[]){
		
		//Taking input from command-line arguments
		int months = Integer.parseInt(args[0]);
		int date = Integer.parseInt(args[1]);
		
		//Displaying the ouput 
		if(checkSpringSeason(months,date)){
			System.out.println("Its a Spring Season");
		}else{
			System.out.println("Its not a Spring Season");
		}
	}
	public static boolean checkSpringSeason(int months, int date){
		if (months == 3 && date >= 20){
			return true;
		}
        if (months == 4 || months == 5){
			return true;
		}
        if (months == 6 && date <= 20){
			return true;
		}
		return false;
	}
}