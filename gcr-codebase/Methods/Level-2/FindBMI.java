import java.util.*;
//Create NumberCheck  Class to compute the BMI of each person
public class FindBMI{
	static int size = 2;
	public static void main(String[] args){
	
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//creating array to store the person weight and height
		float[]weight = new float[size];
		float[]height = new float[size];
		
		//Taking input of weight and height from user
		for(int i =0;i<size;i++){
			System.out.println("Enter the weight:");
			weight[i] = sc.nextFloat();
			System.out.println("Enter the height:");
			height[i] = sc.nextFloat();
		}
		//calling function bmiChecker
		float [] bmi = bmiChecker(weight,height);
		
		//Computing and Displaying the ouput
		for(int i =0;i<bmi.length;i++){
			if(bmi[i]<=18.4){
				System.out.println("UnderWeight");
			}
			else if(bmi[i]>=18.5&&bmi[i]<=24.9){
				System.out.println("Normal");
			}
			else if(bmi[i]>=25.0&&bmi[i]<=39.9){
				System.out.println("OverWeight");
			}else{
				System.out.println("Obese");
			}
		}
	}
	public static float[] bmiChecker(float[] w, float[]h){
		float [] bmi = new float[size];
		for(int i =0;i<size;i++){
			bmi[i]= w[i]/(h[i]*h[i])*(float)30.48;
		}
		return bmi;
	}
}