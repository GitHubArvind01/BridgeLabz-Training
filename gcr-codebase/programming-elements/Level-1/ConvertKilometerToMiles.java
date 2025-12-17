public class ConvertKilometerToMiles{
	public static void main (String args[]){
		double distanceKilometer = 10.8;
		
		double convertMiles = distanceKilometer/1.609;
		System.out.println("The distance " + distanceKilometer + " km in miles is: "+ (convertMiles));
	}
}