package Day_9;

public class PracticeProblemUsingWhileLoopAndForLoop {

	public static void main(String[] args) {
		
	// write a program to print number between 20 and 30	
		
//      While loop
//      while (condition) {
//          statement
//      }
      
      System.out.println("While Loop");
      int num = 20;
      while(num <= 30) {
          System.out.println(num);
          num++;
      }
      
      System.out.println("Current value of varaible num is "+ num);
      
      num = 20;
      
      System.out.println("Do while loop");
      
//      do {
//          your code
//      }while (condition is true);
      
      do {
          System.out.println(num);
          num++;
      }while(num <= 30);
      
      System.out.println("For loop");
      
//      for (statement1 ; statement2 ; statement3) {
//          your code
//      }
      
      for (int i = 20;i < 31; i++) {
          System.out.println(i);
      }
	
		
		
		
		
		
		
		

	}

}
