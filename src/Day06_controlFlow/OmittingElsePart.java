package Day06_controlFlow;

public class OmittingElsePart {

	public static void main(String[] args) {
		
		
		//Syntax:
		
		/*
		 * if (Condition){
		 * 		statement1
		 *      statement2
		 * }
		 * 
		 * */		
		
		
		int a = 4;
		if (a % 2 == 1 ) {	
			System.out.println(a +" is odd number");
			
		}
		
		if (a % 2 ==0) {
		System.out.println(a + " is even number");
		
		}
	
		
		System.out.println("Line #29");
		
		
		int n1 = 300;
		int n2 = 400;
		
		if (n1 > n2) {
		System.out.println("Max number is "+n1);
		System.out.println("Min number is "+n2);
		
		}
		
		if (n1 < n2) {
			System.out.println("Max number is "+n2);
			System.out.println("Min number is " +n1);
		
		}
		
		
		if (n1 == n2) {
			System.out.println("They are equal");
		}
		

	}

}
