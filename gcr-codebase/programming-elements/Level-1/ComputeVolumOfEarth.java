public class ComputeVolumOfEarth{
	static final double pi = 3.14;
	public static void main (String args[]){
		int radiusOfEarth = 6378;
		double volumeOfSphere = (4/3) * pi * (radiusOfEarth*radiusOfEarth*radiusOfEarth);
		System.out.println("The volume of earth in cubic kilometers is "+ volumeOfSphere);
	}
}