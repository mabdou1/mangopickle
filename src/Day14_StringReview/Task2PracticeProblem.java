package Day14_StringReview;

import java.util.Scanner;

public class Task2PracticeProblem {

	public static void main(String[] args) {
		
//      01234
String str = "Pizza";



if(str.length()== 5) {
//reverse your string
//System.out.print(str.charAt(4));
//System.out.print(str.charAt(3));
//System.out.print(str.charAt(2));
//System.out.print(str.charAt(1));
//System.out.print(str.charAt(0));
//System.out.println();

for (int i = str.length()-1; i >=0 ; i--) {
//System.out.println(i);
System.out.print(str.charAt(i));
}


}else if (str.length() > 5) {
System.out.println("Too long!");
}else {
System.out.println("Too short");
}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
