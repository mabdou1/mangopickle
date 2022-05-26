package Day14_StringReview;

public class Task1PracticeProblem {

	public static void main(String[] args) {
		
// Write a program that asks user to enter a sentence. 
//		then print the first & last characters of the sentence.
// Example:
// Input: welcome To TechCircle	
// output: We
		
		
    String input = "Welcome To TechCircle!";
        
        char firstChar = input.charAt(0);
//        char lastChar = input.charAt(21)
        
        System.out.println(input.length());
        
        char lastChar = input.charAt(input.length()-1);
        
        System.out.print(firstChar);
        System.out.print(lastChar);
        System.out.println();
        
        String result = ""+firstChar;
        System.out.println(result);
        result += lastChar;
        System.out.println(result);
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
