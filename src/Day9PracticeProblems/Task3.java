package Day9PracticeProblems;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// Write a program that ask the user to input a positive integer. 
		// It should then print the multiplication table of that number.
		
		int n;
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a positive number");
		 n = input.nextInt();
		 System.out.println("Multiplication Table Of " + n);
		 for (int i = 1; i <= 10; i++) {
			 System.out.println(n + "x" + i + "=" + (n * i));
		 }
		
		 
		 
		
		
	

		
		
		
		

	}

}
