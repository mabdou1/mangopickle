package Day9PracticeProblems;

import java.util.Scanner;

public class Task7NestedIF {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers 1 -12 as it corresponds to the month of the year.");
		
		
		int month = scan.nextInt();
		switch(month) {
	
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + " " + "Has 31 days"); 
			break;
		case 2:
			System.out.println(month + " " + " Has 28 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + " " + " Has 30 days");
			break;
		
		default:
			System.out.println("Invalid Entry");
		
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
