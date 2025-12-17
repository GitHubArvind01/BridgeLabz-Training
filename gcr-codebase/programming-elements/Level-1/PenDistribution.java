public class PenDistribution{
	public static void main (String args[]){
		int numberOfPen = 14;
		int students = 3;
		
		int remainPen = numberOfPen%students;
		int eachStudentGetPen = numberOfPen/students;
		
		
		System.out.println("The Pen Per Student is " + eachStudentGetPen +" and the remaining pen not distributed is: " + remainPen );
	}
}