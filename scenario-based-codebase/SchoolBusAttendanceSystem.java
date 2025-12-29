import java.util.Scanner;

public class SchoolBusAttendanceSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String student[] = {"avi","pappu","ram","ravi","sita","rocky","amit","sonu","allu","arvind"};
		char parsent[] = new char[10];
		int idx = 0;
		
		for(String name: student){
			System.out.println("---------------Chose--------------");
			System.out.println("Name: "+name);
			System.out.println("For Parsent -> P | For Absent -> A");
			System.out.println("----------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			parsent[idx++] = c;
		}
		
		
		//display
		idx = 0;
		int presentCount = 0;
		int absentCount = 0;
		System.out.println("\n---------------Display Attendance--------------");
		for(char p:parsent){
			if(p=='P'){
				presentCount++;
			}
			if(p=='A'){
				absentCount++;
			}
			System.out.println(student[idx++]+ " ->" + ((p=='P')?"Parsent":"Absent"));
		}
		
		System.out.println("\n---- Attendance Summary ----");
        System.out.println("Total Present Students : " + presentCount);
        System.out.println("Total Absent Students  : " + absentCount);
	}
}