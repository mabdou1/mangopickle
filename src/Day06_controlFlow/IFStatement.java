package Day06_controlFlow;

public class IFStatement {

	public static void main(String[] args) {
		
	//Decision making assignments
	// if statements And switch case
		
	//Syntax:
		
	/*
	 * if (Condition){
	 * 		statement1
	 *}else}
	 *      statement2
	 * }
	 * 
	 *
	 * */	
	 
		int a = 5;
		int b = 7;
		//  5 > 7
		if (a > b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
				
		int count = 12;
		int total = 4;
		
		if (count < 3) {
			total = 0;
		}else {
			total = total + count;
		}
		
		System.out.println(total);
		
		
		
		
		

	}

}
