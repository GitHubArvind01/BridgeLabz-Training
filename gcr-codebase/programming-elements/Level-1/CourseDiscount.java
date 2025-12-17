public class CourseDiscount{
	public static void main (String args[]){
		int fee = 125000;
		int discountPercent = 10;
		
		double discountAmount = (double)fee*0.1;
		
		double finalFee =(double) fee-discountAmount;
		
		System.out.println("The discount amount is INR "+ (int)discountAmount +" and final discounted fee is INR " + (int)finalFee);
	}
}