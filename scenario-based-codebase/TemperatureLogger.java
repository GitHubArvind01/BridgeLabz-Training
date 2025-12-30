import java.util.Scanner;

public class TemperatureLogger{
	//creating double array to store temperature of 7days
	static double temperature[] = {44.3,24.2,44,33.8,55,12.44,37.65};
	static double averageTemperature = 0.0;
	static double maxTemperature = 0.0;
	public static void main(String args[]){
		
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