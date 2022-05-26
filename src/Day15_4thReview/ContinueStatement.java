package Day15_4thReview;

public class ContinueStatement {

	public static void main(String[] args) {
		
		
		int n = 10;
		
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i+ " "); // odd numbers
		}
		
								System.out.println("                         ");

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i+ " "); // even numbers
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
