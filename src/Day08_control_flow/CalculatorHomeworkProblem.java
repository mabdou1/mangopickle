package Day08_control_flow;

public class CalculatorHomeworkProblem {

	public static void main(String[] args) {
		
	double numA = 15;
    double numB = 5;
    
    String operator = "+";
    
    double total = 0;
    
    if (operator == "+") {
        total = numA + numB;
    }
    
    if (operator == "-") {
        total = numA - numB;
    }
    
    if (operator == "*") {
        total = numA * numB;
    }
    
    if (operator == "/") {
        total = numA / numB;
    }
    
    System.out.println(total);
    
    System.out.println(numA +" "+operator +" " + numB +" = " + total);
	
	
	
	
	
	
	
	
	
	
	} 
	

}
	