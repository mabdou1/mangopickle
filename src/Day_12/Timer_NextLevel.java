package Day_12;

import java.util.Scanner;

public class Timer_NextLevel {

	public static void main(String[] args) throws InterruptedException {
	
	Scanner scan = new Scanner(System.in);	
	System.out.println("How long do you want to wait for?");
		
	int waitTime = scan.nextInt();
	
	System.out.println(waitTime+ " minute timer start");
		
	for (int i = waitTime-1 ; i >= 0 ; i--) {
		System.out.println(i);
		
		for (int j = 59 ; j >= 0 ; j--) {
			System.out.println(i+ ":" +j);
			Thread.sleep(1000);
	
		}   	

	}

	System.err.println("Time's UP!!");
		
	
	scan.close();	
		
		
		
		
		

	}

}
