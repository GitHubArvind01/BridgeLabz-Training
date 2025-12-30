import java.util.Scanner;

public class TemperatureLogger{
	//creating double array to store temperature of 7days
	static double temperature[] = new double[7];
	static double averageTemperature = 0.0;
	static double maxTemperature = 0.0;
	public static void main(String args[]){
		//scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<7;i++){
			System.out.println("Enter the " + (i+1) + " temperature: ");
			temperature[i] = sc.nextDouble();
		}
		//for each loop to find max temperature and average temperature
		double sumTemperature = 0.0;
		for(double temp:temperature){
			if(temp>maxTemperature){
				maxTemperature = temp;
			}
			sumTemperature+=temp;
		}
		
		averageTemperature = sumTemperature/7;
		
		//output display
		System.out.println("Max Temprature: "+ maxTemperature);
		System.out.println("Max Temprature: "+ averageTemperature);
	}
}