package Day14_StringReview;

import java.util.Scanner;

public class Task5PracticeProblem {

	public static void main(String[] args) {
	
		   String email = "asdfasdfasdf.asdfasdft@texample.in";
	        //The email string must contain an '@' character.
	        
	        boolean hasAtSign = email.contains("@");
//	        System.out.println(hasAtSign);
	        
	        
//	        The email string must contain an '.' character.
	        boolean hasDot = email.contains(".");
	        
	        
//	        The '@' must contain at least one character in front of it.
//	        01
//	        a@example.com
	        boolean hasCharBeforeAtSign = email.indexOf('@') >=1;
	        
	        
//	        System.out.println(hasCharBeforeAtSign);
	        
	        
//	        The '.' and '@' must be in the appropriate places.
	        
	        boolean dotAndAtAreInAppropriatePlaces  = email.lastIndexOf('.') - email.indexOf('@') >=2;
	        
	        
	        
	        if (hasAtSign &&hasDot && hasCharBeforeAtSign && dotAndAtAreInAppropriatePlaces) {
	            System.out.println(true);
	        }else {
	            System.out.println(false);
	        }
	        
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
