import java.util.Scanner;

public class DigitalWatchSimulation{
	public static void main(String args[]){
		
		for(int i=1;i<=12;i++){
			for(int j=0;j<60;j++){
				if(j<=9){
					if(i<=9){
						System.out.print("0"+i);
					}else{
						System.out.print(i);
					}
					System.out.print(":0"+j);
					System.out.println();
				}else{
					if(i<=9){
						System.out.print("0"+i);
					}else{
						System.out.print(i);
					}
					System.out.print(":"+j);
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}